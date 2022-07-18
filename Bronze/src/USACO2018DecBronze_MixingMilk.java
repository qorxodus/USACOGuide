import java.io.*;
import java.util.*;

public class USACO2018DecBronze_MixingMilk {
	
	static Scanner in;
	static PrintWriter out;
	static int[] c = new int[3], m = new int[3];
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("mixmilk.in"));
		out = new PrintWriter(new File("mixmilk.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		for(int i = 0; i < 3; i++) {
			c[i] = in.nextInt();
			m[i] = in.nextInt();
		}
	}
	
	static void solve() {
		
		for(int i = 0; i < 100; i++) {
			m[(i + 1) % 3] += m[i % 3];
			m[i % 3] = 0;
			if(m[(i + 1) % 3] > c[(i + 1) % 3]) {
				m[i % 3] = m[(i + 1) % 3] - c[(i + 1) % 3];
				m[(i + 1) % 3] = c[(i + 1) % 3];
			}
		}
		
		out.println(m[0] + "\n" + m[1] + "\n" + m[2]);
	}
}
