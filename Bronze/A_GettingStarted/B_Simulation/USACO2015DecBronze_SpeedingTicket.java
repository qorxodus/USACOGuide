package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2015DecBronze_SpeedingTicket {
	
	static Scanner in;
	static PrintWriter out;
	static int n, m;
	static ArrayList<Integer> speed = new ArrayList<Integer>(), limit = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("speeding.in"));
		out = new PrintWriter(new File("speeding.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		n = in.nextInt();
		m = in.nextInt();
		for(int i = 0; i < n; i++) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			for(int j = 0; j < num1; j++)
				limit.add(num2);
		}
		for(int i = 0; i < m; i++) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			for(int j = 0; j < num1; j++)
				speed.add(num2);
		}
	}
	
	static void solve() {
		
		int max = 0;
		
		for(int i = 0; i < 100; i++)
			if(speed.get(i) - limit.get(i) > max) max = speed.get(i) - limit.get(i);
		
		out.println(max);
	}
}
