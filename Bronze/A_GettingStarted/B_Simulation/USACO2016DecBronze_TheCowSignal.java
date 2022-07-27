package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2016DecBronze_TheCowSignal {
	
	static Scanner in;
	static PrintWriter out;
	static int m, n, k;
	static String signal = "";
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("cowsignal.in"));
		out = new PrintWriter(new File("cowsignal.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		m = in.nextInt();
		n = in.nextInt();
		k = in.nextInt();
		in.nextLine();
	}
	
	static void solve() {
		
		for(int i = 0; i < m; i++) {
			String line = in.nextLine();
			for(int j = 0; j < k; j++) {
				for(int m = 0; m < n; m++) {
					for(int n = 0; n < k; n++) {
						signal += line.charAt(m);
					}
				}
				signal += "\n";
			}
		}
		
		out.print(signal);
	}
}
