import java.io.*;
import java.util.*;

public class USACO2020FebBronze_Triangles {

    static Scanner in;
	static PrintWriter out;
	static int n, x[], y[], ans;
	static TreeSet<Integer> setX = new TreeSet<Integer>(), setY = new TreeSet<Integer>();
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("triangles.in"));
		out = new PrintWriter(new File("triangles.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	n = in.nextInt();
    	x = new int[n];
    	y = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		x[i] = in.nextInt();
    		y[i] = in.nextInt();
    	}
    }
    
    static void solve() {
    	  
    	for(int i = 0; i < n; i++) 
    		for(int j = i + 1; j < n; j++) 
    			for(int k = j + 1; k < n; k++)
    				if(okay(i, j, k)) ans = Math.max(ans, (setX.last() - setX.first()) * (setY.last() - setY.first()));
    	
    	out.println(ans);
    }
    
    static boolean okay(int i, int j, int k) {
    	setX.clear();
    	setY.clear();
    	setX.add(x[i]);
    	setX.add(x[j]);
    	setX.add(x[k]);
    	setY.add(y[i]);
    	setY.add(y[j]);
    	setY.add(y[k]);
    	return setX.size() == 2 && setY.size() == 2;
    }
}
    