package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2016FebBronze_CircularBarn {

    static Scanner in;
	static PrintWriter out;
	static int n, barn[], total;
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("cbarn.in"));
		out = new PrintWriter(new File("cbarn.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	n = in.nextInt();
    	barn = new int[n];
    	for(int i = 0; i < n; i++) {
    		barn[i] = in.nextInt();
    		total += barn[i];
    	}
    }
    
    static void solve() {
    	
    	int min = Integer.MAX_VALUE;
    	for(int i = 0; i < n; i++) {
    		int ans = 0, j = i, cows = total;
    		while(true) {
    			cows -= barn[j];
    			ans += cows;
    			j++;
    			if(cows == 0) break;
    			if(j == barn.length) j = 0; 
    		}
    		if(ans < min) min = ans;
    	}
    	
    	out.println(min);
    }
}

