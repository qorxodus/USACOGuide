package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2015FebBronze_Censoring {

    static Scanner in;
	static PrintWriter out;
	static String s, t;
    
    public static void main(String[] args) throws IOException {

        in = new Scanner(System.in);        
		//in = new Scanner(new File("censor.in"));
		//out = new PrintWriter(new File("censor.out"));
		
        init();
        solve();
        
        in.close();
        //out.close();
    }
    
    static void init() {    

    	s = in.next();
    	t = in.next();
    }
    
    static void solve() {
    	  
    	while(s.indexOf(t) > 0) {
    		s = s.substring(0, s.indexOf(t)) + s.substring(s.indexOf(t) + t.length());
    	}
    	
    	System.out.println(s);
    }
}