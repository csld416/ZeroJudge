import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d318 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int n) {
		String s = Integer.toString(n, 3);
		System.out.println(s);

	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n < 0) {
				System.exit(0);
			}
			solve(n);
		}
		
	}

}
