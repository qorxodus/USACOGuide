package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2019JanBronze_ShellGame {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static int[] a, b, g;
	static boolean[] shells = new boolean[3];
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("shell.in"));
		out = new PrintWriter(new File("shell.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		n = in.nextInt();
		a = new int[n];
		b = new int[n];
		g = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			g[i] = in.nextInt();
		}
	}
	
	static void solve() {
		
		int max = 0;
		
		for(int i = 0; i < 3; i++) {
			shells[i] = true;
			int score = 0;
			for(int j = 0; j < n; j++) {
				boolean temp = shells[a[j] - 1];
				shells[a[j] - 1] = shells[b[j] - 1];
				shells[b[j] - 1] = temp;
				if(shells[g[j] - 1] == true) score++;
			}
			if(score > max) max = score;
			score = 0;
			shells = new boolean[3];
		}
		
		out.println(max);
	}
}
