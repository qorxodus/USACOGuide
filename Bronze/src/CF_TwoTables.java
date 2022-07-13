import java.io.*;
import java.util.*;

public class CF_TwoTables {
	
	static Scanner in;
	static PrintWriter out;
	static int t;
	
	public static void main(String[] args) throws IOException {
		
		in = new Scanner(System.in);
		//in = new Scanner(new File("billboard.in"));
		//out = new PrintWriter(new File("billboard.out"));
		
		
		init();
		for(int i = 0; i < t; i++) {
			solve();
		}
		
		in.close();
		//out.close();
	}
	
	static void init() {
		
		t = in.nextInt();
	}
	
	static void solve() {
		
		int w, h, x1, x2, y1, y2, W, H;
		w = in.nextInt();
		h = in.nextInt();
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		W = in.nextInt();
		H = in.nextInt();
	}
}
