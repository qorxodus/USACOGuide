package A_RectangleGeometry;
import java.io.*;
import java.util.*;

public class Codeforces_TwoTables {
	
	static Scanner in;
	static PrintWriter out;
	static int t, W, H, x1, x2, y1, y2, w, h;
	
	public static void main(String[] args) throws IOException {
		
		in = new Scanner(System.in);
		//in = new Scanner(new File("billboard.in"));
		//out = new PrintWriter(new File("billboard.out"));
		
		t = in.nextInt();
		for(int i = 0; i < t; i++) {
			init();
			solve();
		}
		
		in.close();
		//out.close();
	}
	
	static void init() {
		
		W = in.nextInt();
		H = in.nextInt();
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		w = in.nextInt();
		h = in.nextInt();
	}
	
	static void solve() {
		
		if(x2 - x1 + w <= W && y2 - y1 + h <= H) System.out.println(Math.min(h - y1, w - x1));
		else if(x1 >= w || y1 >= h) System.out.println(0);
		else if(x2 - x1 + w <= W) System.out.println(w - x1);
		else if(y2 - y1 + h <= H) System.out.println(h - y1);
		else System.out.println(-1);
	}
}
