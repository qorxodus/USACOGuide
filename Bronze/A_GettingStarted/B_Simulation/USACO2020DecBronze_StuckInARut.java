package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2020DecBronze_StuckInARut {

    static Scanner in;
	static PrintWriter out;
	static int n, x[], y[];
	static String d[];
	
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
    	d = new String[n];
    	
    	for(int i = 0; i < n; i++) {
    		d[i] = in.next();
    		x[i] = in.nextInt();
    		y[i] = in.nextInt();
    	}
    }
    
    static void solve() {
    	
    	
    }
}