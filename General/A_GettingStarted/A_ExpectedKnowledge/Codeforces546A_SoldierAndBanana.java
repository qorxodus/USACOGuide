package A_ExpectedKnowledge;
import java.util.*;

public class Codeforces546A_SoldierAndBanana {
	
	static Scanner in;
	static int k, n, w;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		k = in.nextInt();
		n = in.nextInt();
		w = in.nextInt();
		
		int cost = w * (w + 1) * k / 2;
		
		if(cost - n < 0) System.out.println(0);
		else System.out.println(cost - n);
	}

}
