package A_ExpectedKnowledge;
import java.util.*;
import java.io.*;

public class USACO2020DecBronze_DoYouKnowYourABCs {

	static Scanner in;
	static PrintWriter out;
	static int num1, num2, num3, num4, num5, num6, num7;
	
	public static void main(String[] args) throws IOException {
		
		in = new Scanner(System.in);
		//in = new Scanner(new File("teleport.in"));
		//out = new PrintWriter(new File("teleport.out"));
		
		init();
		solve();
		
		in.close();
		//out.close();
	}
	
	static void init() {
		
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		num5 = in.nextInt();
		num6 = in.nextInt();
		num7 = in.nextInt();	
	}
	
	static void solve() {
		
		int[] arr = {num1, num2, num3, num4, num5, num6, num7};
		Arrays.sort(arr);
		if(arr[0] + arr[1] == arr[3]) System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		else System.out.println(arr[0] + " " + arr[1] + " " + arr[3]);
	}
}
