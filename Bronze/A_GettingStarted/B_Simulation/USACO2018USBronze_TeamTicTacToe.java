package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2018USBronze_TeamTicTacToe {

    static Scanner in;
	static PrintWriter out;
	static char squares[][];
    
    public static void main(String[] args) throws IOException {

        //in = new Scanner(System.in);        
		in = new Scanner(new File("tttt.in"));
		out = new PrintWriter(new File("tttt.out"));
		
        init();
        solve();
        
        in.close();
        out.close();
    }
    
    static void init() {    

    	squares = new char[3][3];
    	
    	for(int i = 0; i < 3; i++) squares[i] = in.next().toCharArray();
    }
    
    static void solve() {
    
    	ArrayList<ArrayList<Character>> ans = new ArrayList<ArrayList<Character>>();
    	
		ArrayList<Character> diagonal1 = new ArrayList<Character>(), diagonal2 = new ArrayList<Character>();
    	
		for(int i = 0; i < 3; i++) {
			ArrayList<Character> horizontal = new ArrayList<Character>(), vertical = new ArrayList<Character>();
    		for(int j = 0; j < 3; j++) {
        		if(!horizontal.contains(squares[i][j])) horizontal.add(squares[i][j]);
        		if(!vertical.contains(squares[j][i])) vertical.add(squares[j][i]);
    		}
    		if(!diagonal1.contains(squares[i][i])) diagonal1.add(squares[i][i]);
    		if(!diagonal2.contains(squares[i][2 - i])) diagonal2.add(squares[i][2 - i]);
    		Collections.sort(horizontal);
    		Collections.sort(vertical);
    		ans.add(horizontal);
    		ans.add(vertical);
    	}
		Collections.sort(diagonal1);
		Collections.sort(diagonal2);
		ans.add(diagonal1);
		ans.add(diagonal2);
		
		int count1 = 0, count2 = 0;
		
    	ArrayList<ArrayList<Character>> temp = new ArrayList<ArrayList<Character>>();
		
		for(int i = 0; i < ans.size(); i++) {
			if(ans.get(i).size() == 1 && !temp.contains(ans.get(i))) {
				count1++;
				temp.add(ans.get(i));
			}
			if(ans.get(i).size() == 2 && !temp.contains(ans.get(i))) {
				count2++;
				temp.add(ans.get(i));
			}
		}

    	out.println(count1);
    	out.println(count2);
    }
}

