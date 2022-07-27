package Other;
import java.io.*;
import java.util.*;

public class USACO2019DecBronze_CowGymnastics {

    static Scanner in;
	static PrintWriter out;
	static int k, n;
    
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

    	k = in.nextInt();
    	n = in.nextInt();
    }
    
    static void solve() {
    
    	
    }
}

