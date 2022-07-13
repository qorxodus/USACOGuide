import java.util.*;

public class CF_WhiteSheet {
	
	static Scanner in;
	static rectangle white, black1, black2;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		init();
		solve();
	}
	
	static void init() {
		
		white = new rectangle(in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong());
		black1 = new rectangle(in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong());
		black2 = new rectangle(in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong());
	}
	
	static void solve() {
		
		long intersection = overlap(white, black1) + overlap(white, black2) - overlap(white, black1, black2);
		long whiteArea = (white.x2 - white.x1)* (white.y2 - white.y1); 
		
		if(whiteArea <= intersection) System.out.println("NO");
		else System.out.println("YES");
	}
	
	static long overlap(rectangle a, rectangle b) {
		
		long leftX = Math.max(a.x1, b.x1);
		long rightX = Math.min(a.x2, b.x2);
		long bottomY = Math.max(a.y1, b.y1);
		long topY = Math.min(a.y2, b.y2);
		
		if(rightX - leftX <= 0 || topY - bottomY <= 0) return 0;
		else return (rightX - leftX) * (topY - bottomY);
	}
	
	static long overlap(rectangle a, rectangle b, rectangle c) {
		
		long leftX = Math.max(Math.max(a.x1, b.x1), c.x1);
		long rightX = Math.min(Math.min(a.x2, b.x2), c.x2);
		long bottomY = Math.max(Math.max(a.y1, b.y1), c.y1);
		long topY = Math.max(Math.min(a.y2, b.y2), c.y2);
		
		if(rightX - leftX <= 0 || topY - bottomY <= 0) return 0;
		else return (rightX - leftX) * (topY - bottomY);
	}
	
	static class rectangle {
		
		long x1, y1, x2, y2;
		
		rectangle(long a, long b, long c, long d) {
			
			x1 = a; y1 = b; x2 = c; y2 = d;
		}
	}
}
