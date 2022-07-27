package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2017DecBronze_TheBovineShuffle {

    static Scanner in;
	static PrintWriter out;
    static int n, a[], id[], ans[];
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("shuffle.in"));
		out = new PrintWriter(new File("shuffle.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	n = in.nextInt();
    	a = new int[n];
    	id = new int[n];
    	ans = new int[n];
    	    	
    	for(int i = 0; i < n; i++)
    		a[in.nextInt() - 1] = i;
    	    	
    	for(int i = 0; i < n; i++)
    		id[i] = in.nextInt();
    }
    
    static void solve() {
    
    	for(int i = 0; i < n; i++)
    		ans[a[a[a[i]]]] = id[i];
    	
    	for(int i = 0; i < n; i++)
    		out.println(ans[i]);
    }
}

