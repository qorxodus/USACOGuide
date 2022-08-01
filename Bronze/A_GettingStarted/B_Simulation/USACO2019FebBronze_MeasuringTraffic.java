package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2019FebBronze_MeasuringTraffic {

    static Scanner in;
	static PrintWriter out;
	static int n, l[], r[];
	static String d[];
    
    public static void main(String[] args) throws IOException {

        in = new Scanner(System.in);        
		//in = new Scanner(new File("traffic.in"));
		//out = new PrintWriter(new File("traffic.out"));
		
        init();
        solve();
        
        in.close();
        //out.close();
    }
    
    static void init() {    

    	n = in.nextInt();
    	l = new int[n];
    	r = new int[n];
    	d = new String[n];
    	
    	for(int i = 0; i < n; i++) {
    		d[i] = in.next();
    		l[i] = in.nextInt();
    		r[i] = in.nextInt();
    	}
    }
    
    static void solve() {
    
    	int L = -999999999;
    	int R = 999999999;
    	
    	for(int i = n - 1; i >= 0; i--) {
    		if(d[i].equals("none")) {
    			L = Math.max(L, l[i]);
    			R = Math.max(R, r[i]);
    		}
    		if(d[i].equals("off")) {
    			L += l[i];
    			R += r[i];
    		}
    		else {
    			L -= r[i];
    			R -= l[i];
    			if(L < 0) L = 0;
    		}
    	}
    	
    	System.out.println(L + " " + R);
    	
    	for(int i = 0; i < n; i++) {
    		if(d[i].equals("none")) {
    			L = Math.max(L, l[i]);
    			R = Math.max(R, r[i]);
    		} 
    		if(d[i].equals("off")) {
    			L -= r[i];
    			R -= l[i];
    		}
    		else {
    			L += l[i];
    			R += r[i];
    			if(L < 0) L = 0;
    		}
    	}
    	
    	System.out.println(L + " " + R);
    }
}

