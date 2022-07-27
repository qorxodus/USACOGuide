package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2018DecBronze_TheBucketList {

    static Scanner in;
	static PrintWriter out;
	static int time[], n;
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("blist.in"));
		out = new PrintWriter(new File("blist.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	time = new int[1001];
    	n = in.nextInt();
    }
    
    static void solve() {
    
    	for(int i = 0; i < n; i++) {
    		int s = in.nextInt();
    		int t = in.nextInt();
    		int b = in.nextInt();
    		for(int j = s; j <= t; j++) time[j] += b;
    	}
    	
    	int max = 0;
    	for(int i = 1; i < time.length; i++) if(time[i] > max) max = time[i];
    	
    	out.println(max);
    }
}

