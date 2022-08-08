package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2015FebBronze_Censoring {

    static Scanner in;
	static PrintWriter out;
	static String s, t;
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("censor.in"));
		out = new PrintWriter(new File("censor.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	s = in.next();
    	t = in.next();
    }
    
    static void solve() {
    	
    	StringBuilder sb = new StringBuilder();
    	  
    	for(int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			if(sb.length() >= t.length() && sb.substring(sb.length() - t.length(), sb.length()).equals(t)) {
				sb.delete(sb.length() - t.length(), sb.length() + 1);
			}
		}
    	
    	out.println(sb);
    }
}