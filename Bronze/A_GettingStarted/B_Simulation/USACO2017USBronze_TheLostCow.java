package B_Simulation;
import java.io.*;
import java.util.*;

public class USACO2017USBronze_TheLostCow {
	
	static Scanner in;
	static PrintWriter out;
	static int x, y;
	
	public static void main(String[] args) throws IOException {
		
		//in = new Scanner(System.in);
		in = new Scanner(new File("lostcow.in"));
		out = new PrintWriter(new File("lostcow.out"));
		
		init();
		solve();
		
		in.close();
		out.close();
	}
	
	static void init() {
		
		x = in.nextInt();
		y = in.nextInt();
	}
	
	static void solve() {
		
		int distance = 0;
		int current = x;
		int next = 0;
		int change = 1;
		
		while(true) {
			next = x + change;
			if((y <= next && y >= current) || (y >= next && y <= current)) {
				distance += Math.abs(y - current);
				break;
			}
			else distance += Math.abs(next - current);
			change *= -2;
			current = next;
		}
		
		out.println(distance);
	}
}
