package A_RectangleGeometry;
import java.io.*;
import java.util.*;

public class USACO2017DecBronze_BlockedBillboard {
	
	static Scanner in;
	static PrintWriter out;
	static int x1, x2, x3, x4, x5, x6, y1, y2, y3, y4, y5, y6, ans = 0;
	static boolean a[][];
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("billboard.in"));
		out = new PrintWriter(new File("billboard.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		x1 = in.nextInt() + 1000;
		y1 = in.nextInt() + 1000;
		x2 = in.nextInt() + 1000;
		y2 = in.nextInt() + 1000;
		x3 = in.nextInt() + 1000;
		y3 = in.nextInt() + 1000;
		x4 = in.nextInt() + 1000;
		y4 = in.nextInt() + 1000;
		x5 = in.nextInt() + 1000;
		y5 = in.nextInt() + 1000;
		x6 = in.nextInt() + 1000;
		y6 = in.nextInt() + 1000;
		
		a = new boolean[2001][2001];
	}
	
	static void solve() {
		
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j < y2; j++) a[i][j] = true;
		}
		
		for(int i = x3; i < x4; i++) {
			for(int j = y3; j < y4; j++) a[i][j] = true;
		}
		
		for(int i = x5; i < x6; i++) {
			for(int j = y5; j < y6; j++) a[i][j] = false;
		}
		
		for(int i = 0; i < 2001; i++) {
			for(int j = 0; j < 2001; j++) if(a[i][j]) ans++;
		}
		
		out.println(ans);
	}
}
