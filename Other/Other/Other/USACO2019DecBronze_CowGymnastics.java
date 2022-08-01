package Other;
import java.io.*;
import java.util.*;

public class USACO2019DecBronze_CowGymnastics {

    static Scanner in;
	static PrintWriter out;
	static int k, n, a[][], wins, ans;
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("gymnastics.in"));
		out = new PrintWriter(new File("gymnastics.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	k = in.nextInt();
    	n = in.nextInt();
    	
    	a = new int[k][n];
    	for(int i = 0; i < k; i++) {
    		for(int j = 0; j < n; j++) 
    			a[i][in.nextInt() - 1] = j;
    	}
    }
    
    static void solve() {
    
    	ans = 0;
    	
    	for(int i = 0; i < n - 1; i++) {
    		for(int j = i + 1; j < n; j++) {
    			wins = 0;
    			for(int r = 0; r < k; r++) {
    				if(a[r][i] < a[r][j]) wins++;
    				
    			}
    			if(wins == 0 || wins == k) ans++;
    		}
    	}
    	
    	out.println(ans);
    }
}

