package A_ExpectedKnowledge;
import java.util.*;

public class Codeforces231A_Team {
	
	static Scanner in;
	static int n, sum, cnt;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		n = in.nextInt();
		
		while(n-- > 0) {
			sum = in.nextInt() + in.nextInt() + in.nextInt();
			if(sum >= 2) cnt++;
		}
		
		System.out.println(cnt);
	}

}
