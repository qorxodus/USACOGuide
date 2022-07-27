package A_RectangleGeometry;
import java.io.*;
import java.util.*;

public class USACO2016DecBronze_SquarePasture {
	
	static Scanner in;
	static PrintWriter out;
	static int x1, x2, x3, x4, y1, y2, y3, y4;
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("square.in"));
		out = new PrintWriter(new File("square.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		x3 = in.nextInt();
		y3 = in.nextInt();
		x4 = in.nextInt();
		y4 = in.nextInt();
	}
	
	static void solve() {
		
		int minX = Math.min(x1, x3);
		int maxX = Math.max(x2, x4);
		int minY = Math.min(y1, y3);
		int maxY = Math.max(y2, y4);
		out.println(Math.max(maxX - minX, maxY - minY) * Math.max(maxX - minX, maxY - minY));
	}
}
