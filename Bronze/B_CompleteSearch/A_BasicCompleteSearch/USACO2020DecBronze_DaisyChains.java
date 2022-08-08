package A_BasicCompleteSearch;
import java.io.*;
import java.util.*;

public class USACO2020DecBronze_DaisyChains {

    static Scanner in;
	static PrintWriter out;
	static int n, flowers[];
	
    public static void main(String[] args) throws IOException {

        in = new Scanner(System.in);        
		//in = new Scanner(new File("diamond.in"));
		//out = new PrintWriter(new File("diamond.out"));
		
        init();
        solve();
        
        in.close();
        //out.close();
    }
        
    static void init() {    

    	n = in.nextInt();
    	flowers = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		flowers[i] = in.nextInt();
    	}
    }
    
    static void solve() {
    	
    	int ans = 0;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = i; j < n; j++) {
    			ArrayList<Integer> list = new ArrayList<Integer>();
    			double sum = 0;
    			for(int k = i; k <= j; k++) {
    				sum += flowers[k];
    				list.add(flowers[k]);
    			}
    			if((int)sum / list.size() == sum / list.size() && list.contains((int)sum / list.size())) ans++;
    		}
    	}
    	
    	System.out.println(ans);
    }
}