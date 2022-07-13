import java.io.*;
import java.util.*;

public class USACO2016JanBronze_PromotionCounting {
	
	static Scanner in;
	static PrintWriter out;
	static int b1, b2, s1, s2, g1, g2, p1, p2;
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("promote.in"));
		out = new PrintWriter(new File("promote.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		b1 = in.nextInt();
		b2 = in.nextInt();
		s1 = in.nextInt();
		s2 = in.nextInt();
		g1 = in.nextInt();
		g2 = in.nextInt();
		p1 = in.nextInt();
		p2 = in.nextInt();
	}
	
	static void solve() {
		
		int b_s, s_g, g_p;
		
		g_p = p2 - p1;
		g2 += g_p;
		s_g = g2 - g1;
		s2 += s_g;
		b_s = s2 - s1;
		
		out.println(b_s);
		out.println(s_g);
		out.println(g_p);
	}
}
