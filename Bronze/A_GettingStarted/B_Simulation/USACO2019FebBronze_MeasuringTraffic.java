package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2019FebBronze_MeasuringTraffic {

    static Scanner in;
	static PrintWriter out;
	static int n;
    
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

    	n = in.nextInt();
    }
    
    static void solve() {
    
    	
    }
}

