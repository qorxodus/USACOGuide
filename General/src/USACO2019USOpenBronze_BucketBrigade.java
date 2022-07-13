import java.util.*;
import java.io.*;

public class USACO2019USOpenBronze_BucketBrigade {

	static Scanner in;
	static PrintWriter out;
	static char[][] farm = new char[10][10];
	static int x_b, y_b, x_l, y_l, x_r, y_r, ans = 0;
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("buckets.in"));
		out = new PrintWriter(new File("buckets.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		for (int i = 0; i < 10; i++) {
			String line = in.nextLine();
			for(int j = 0; j < 10; j++) {
				if(line.charAt(j) == 'B') {
					x_b = i;
					y_b = j;
				}
				if(line.charAt(j) == 'L') {
					x_l = i;
					y_l = j;
				}
				if(line.charAt(j) == 'R') {
					x_r = i;
					y_r = j;
				}
			}
		}
	}
	
	static void solve() {
		
		int ans = 0;
		if((x_b == x_l && x_l == x_r && (y_b < y_r && y_r < y_l || y_b > y_r && y_r > y_l)) || (y_b == y_l && y_l == y_r && (x_b < x_r && x_r < x_l || x_b > x_r && x_r > x_l))) ans = 2;
		out.println(Math.abs(x_b - x_l) + Math.abs(y_b - y_l) - 1 + ans);
	}
}
