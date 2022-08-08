package A_BasicCompleteSearch;
import java.io.*;
import java.util.*;

public class Codeforces102951A_MaximumDistance {

    static Scanner in;
	static PrintWriter out;
	static int n, x[], y[];
	
    public static void main(String[] args) throws IOException {

        in = new Scanner(System.in);        
		//in = new Scanner(new File("measurement.in"));
		//out = new PrintWriter(new File("measurement.out"));
		
        init();
        solve();
        
        in.close();
        //out.close();
    }
        
    static void init() {    

    	n = in.nextInt();
    	x = new int[n];
    	y = new int[n];
    	
    	for(int i = 0; i < n; i++) x[i] = in.nextInt();
    	for(int i = 0; i < n; i++) y[i] = in.nextInt();
    }
    
    static void solve() {
    	
    	int max = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = i + 1; j < n; j++) {
    			max = (int)Math.max(max, Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
    		}
    	}
    	
    	System.out.println(max);
    }
}