package A_ExpectedKnowledge;
import java.util.*;
import java.io.*;

public class USACO2020JanBronze_WordProcessor {

	static Scanner in;
	static PrintWriter out;
	static int n, k, current = 0;
	static String ans = "";
	static String[] essay;
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("word.in"));
		out = new PrintWriter(new File("word.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		n = in.nextInt();
		k = in.nextInt();
		essay = new String[n];
		for(int i = 0; i < n; i++) {
			essay[i] = in.next();
		}
	}
	
	static void solve() {
		
		for(int i = 0; i < n; i++) {
			if(essay[i].length() + current <= k) {
				ans += essay[i] + " ";
				current += essay[i].length();
			}
			else {
				ans = ans.substring(0, ans.length() - 1) + "\n" + essay[i] + " ";
				current = essay[i].length();
			}
		}
		out.println(ans.substring(0, ans.length() - 1));
	}
}
