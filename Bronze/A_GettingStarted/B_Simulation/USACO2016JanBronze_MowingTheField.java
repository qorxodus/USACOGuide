package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2016JanBronze_MowingTheField {

    static Scanner in;
	static PrintWriter out;
	static int n, moves[];
	static String direction[];
	static ArrayList<Integer>[][] a = new ArrayList [2001][2001];
	static ArrayList<Integer> iList = new ArrayList<Integer>(), jList = new ArrayList<Integer>();
    
    public static void main(String[] args) throws IOException {

        in = new Scanner(System.in);    
		//in = new Scanner(new File("mowing.in"));
		//out = new PrintWriter(new File("mowing.out"));
		
        init();
        solve();
        
        in.close();
        //out.close();
    }
    
    static void init() {    

		n = in.nextInt();
		
		for(int i = 0; i < a.length; i++) {
		      for(int j = 0; j < a[i].length; j++) a[i][j] = new ArrayList<Integer>();
		}
		
		direction = new String[n];
		moves = new int[n];
		
		for(int i = 0; i < n; i++) {
			direction[i] = in.next();
			moves[i] = in.nextInt();
		}
		
		a[1000][1000].add(0);
		
		for(int i = 0; i < 2001; i++) {
			for(int j = 0; j < 2001; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		}
    
    static void solve() {
    
    	int t = 0;
    	int positionX = 1000, positionY = 1000;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < moves[i]; j++) {
    			if(direction[i] == "N") positionY++;
    			else if(direction[i] == "E") positionX++;
    			else if(direction[i] == "S") positionY--;
    			else positionX--;
    			t++;
    			a[positionX][positionY].add(t);
    		}
    	}
    	
    	for(int i = 0; i < 2001; i++) {
    		for(int j = 0; j < 2001; j++) {
    			if(a[i][j].size() >= 2) {
	    			iList.add(i);
	    			jList.add(j);
    			}
    		}
    	}
    	
    	int min = 1000000000;
    	
    	for(int i = 0; i < iList.size(); i++) {
    		for(int j = 0; j < a[iList.get(i)][jList.get(i)].size() - 1; j++) {
    			if(a[iList.get(i)][jList.get(i)].get(j + 1) - a[iList.get(i)][jList.get(i)].get(j) < min) {
    				min = a[iList.get(i)][jList.get(i)].get(j + 1) - a[iList.get(i)][jList.get(i)].get(j);
    			}
    		}
    	}
    	
    	System.out.println(min);
    }
}

