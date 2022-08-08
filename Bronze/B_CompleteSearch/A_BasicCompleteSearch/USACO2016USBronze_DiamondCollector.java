package A_BasicCompleteSearch;
import java.io.*;
import java.util.*;

public class USACO2016USBronze_DiamondCollector {

    static Scanner in;
	static PrintWriter out;
	static int n, k, list[];
	
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("diamond.in"));
		out = new PrintWriter(new File("diamond.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
        
    static void init() {    

    	n = in.nextInt();
    	k = in.nextInt();
    	list = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		list[i] = in.nextInt();
    	}
    	
    	Arrays.sort(list);
    }
    
    static void solve() {
    	
    	int max = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < list.length; i++) {
    		int end = i;
    		for(int j = i; j < list.length; j++) {
    			if(list[j] - list[i] > k) {
    				end = j;
    				break;
    			}
    			if(j == list.length - 1) end = n;
    		}
    		max = Math.max(max, end - i);
    	}
    	
    	out.println(max);
    }
}