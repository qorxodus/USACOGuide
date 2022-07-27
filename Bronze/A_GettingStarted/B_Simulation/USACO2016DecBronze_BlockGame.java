package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2016DecBronze_BlockGame {

    static Scanner in;
	static PrintWriter out;
    static int n, w1[], w2[], ans[];
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);
		in = new Scanner(new File("blocks.in"));
		out = new PrintWriter(new File("blocks.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	n = in.nextInt();
    	ans = new int[26];
    }
    
    static void solve() {
    	
    	for(int i = 0; i < n; i++) {
    		String word1 = in.next();
    		String word2 = in.next();
    		w1 = new int[26];
    		w2 = new int[26];
    		for(int j = 0; j < word1.length(); j++) w1[word1.charAt(j) - 'a']++;    			
    		for(int j = 0; j < word2.length(); j++) w2[word2.charAt(j) - 'a']++;
    		for(int j = 0; j < 26; j++) ans[j] += Math.max(w1[j], w2[j]);
    	}

    	for(int i = 0; i < 26; i++) out.println(ans[i]);
    }
}

