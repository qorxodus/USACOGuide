package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2016JanBronze_MowingTheField {

    static Scanner in;
	static PrintWriter out;
	static int a[][], t, min = Integer.MAX_VALUE, n, steps[], x, y;
	static String direction[];
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);    
		in = new Scanner(new File("mowing.in"));
		out = new PrintWriter(new File("mowing.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	n = in.nextInt();
    	
    	a = new int[2001][2001];
    	
    	direction = new String[n];
    	steps = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		direction[i] = in.next();
    		steps[i] = in.nextInt();
    	}
    }
    
    static void solve() {
    
    	x = 1000;
    	y = 1000;
    	t = 0;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < steps[i]; j++) {
	    		if(direction[i].equals("N")) y++;
	    		else if(direction[i].equals("E")) x++;
	    		else if(direction[i].equals("S")) y--;
	    		else x--;
	    		t++;
	    		if(a[x][y] != 0) min = Math.min(min, t - a[x][y]);
	    		a[x][y] = t;
    		}
    	}
    	
    	if(min == Integer.MAX_VALUE) out.println(-1);
    	else out.println(min);
    }
}

