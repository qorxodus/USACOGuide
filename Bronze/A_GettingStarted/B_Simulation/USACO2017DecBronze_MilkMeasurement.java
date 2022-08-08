package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2017DecBronze_MilkMeasurement {

    static Scanner in;
	static PrintWriter out;
	static int n;
	static ArrayList<triple> a = new ArrayList<triple>();
	
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("measurement.in"));
		out = new PrintWriter(new File("measurement.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static class triple implements Comparable<triple> {

        int day; String name; int milk;
        
        triple(int a, String b, int c) {
            day = a;
            name = b;
            milk = c;
        }
        
        @Override
        public int compareTo(triple o) {            
            return this.day - o.day;
        }
    }
    
    static void init() {    

    	n = in.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		int day = in.nextInt();
    		String name = in.next();
    		int milk = in.nextInt();
    		a.add(new triple(day, name, milk));
    	}
    	
    	Collections.sort(a);
    }
    
    static void solve() {
    	
    	int[] cow = {7, 7, 7};
    	boolean[] leaderboard = {true, true, true};
    	int ans = 0;
    	
    	for(int i = 0; i < n; i++) {
    		String name = a.get(i).name;
    		int milk = a.get(i).milk;
    		if(name.equals("Bessie")) cow[0] += milk;
    		else if(name.equals("Elsie")) cow[1] += milk;
    		else cow[2] += milk;
    		int max = Math.max(cow[0], Math.max(cow[1], cow[2]));
    		boolean[] previous = leaderboard.clone();
    		for(int j = 0; j < 3; j++) {
    			if(cow[j] == max) leaderboard[j] = true;
    			else leaderboard[j] = false;
    		}
    		if(!Arrays.equals(previous, leaderboard)) ans++;
    	}
    	
    	out.println(ans);
    }
}