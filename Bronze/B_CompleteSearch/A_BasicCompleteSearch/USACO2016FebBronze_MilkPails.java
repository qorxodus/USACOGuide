package A_BasicCompleteSearch;
import java.io.*;
import java.util.*;

public class USACO2016FebBronze_MilkPails {

    static Scanner in;
	static PrintWriter out;
	static int x, y, m;
	
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("pails.in"));
		out = new PrintWriter(new File("pails.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
        
    static void init() {    

    	x = in.nextInt();
    	y = in.nextInt();
    	m = in.nextInt();
    }
    
    static void solve() {
    	
    	int xMax = m / x;
    	int yMax = m / y;
    	int ans = Integer.MIN_VALUE;
    	
    	for(int i = 0; i <= xMax; i++) {
    		for(int j = 0; j <= yMax; j++) {
    			if(x * i + y * j <= m) ans = Math.max(ans, x * i + y * j);
    		}
    	}
    	
    	out.println(ans);
    }
}