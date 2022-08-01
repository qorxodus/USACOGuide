package A_RectangleGeometry;
import java.util.*;
import java.io.*;

public class Codeforces1216C_WhiteSheet {
	
	static Scanner in;
	static PrintWriter out;
	static rectangle white, black1, black2;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
 
		init();
		solve();
 
		in.close();
	}
 
	static void init() {
		
		white = new rectangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		black1 = new rectangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		black2 = new rectangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
	}
 
	static void solve() {
		
		long area = (long) (white.x2 - white.x1) * (white.y2 - white.y1);
		long overlap = overlap(white, black1) + overlap(white, black2) - overlap(white, black1, black2);
		
		if(area > overlap) System.out.println("YES");
		else System.out.println("NO");
	}
	
	static long overlap(rectangle a, rectangle b) {
		
		long top = Math.min(a.y2, b.y2);
		long bottom = Math.max(a.y1, b.y1);
		long right = Math.min(a.x2, b.x2);
		long left = Math.max(a.x1, b.x1);
		
		if(top < bottom || right < left) return 0;
		else return (long) (top - bottom) * (right - left);
	}
	
	static long overlap(rectangle a, rectangle b, rectangle c) {
		
		long top = Math.min(Math.min(a.y2, b.y2), c.y2);
		long bottom = Math.max(Math.max(a.y1, b.y1), c.y1);
		long right = Math.min(Math.min(a.x2, b.x2), c.x2);
		long left = Math.max(Math.max(a.x1, b.x1), c.x1);
		
		if(top < bottom || right < left) return 0;
		else return (long) (top - bottom) * (right - left);
	}
 
	static class rectangle {
		
		int x1, y1, x2, y2;
		
		rectangle(int a, int b, int c, int d) {
			
			x1 = a; y1 = b; x2 = c; y2 = d;
		}
	}
}
