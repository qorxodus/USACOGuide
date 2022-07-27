package A_RectangleGeometry;
import java.io.*;
import java.util.*;

public class USACO2015DecBronze_FencePainting {
	
	static Scanner in;
	static PrintWriter out;
	static int a, b, c, d;
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter(new File("paint.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
	}
	
	static void solve() {
		
		if(b <= c) out.println(b - a + d - c);
		else {
			if(a > d) out.println(b - a + d - c);
			else out.println(Math.max(d - a, b - c));
		}
	}
}
