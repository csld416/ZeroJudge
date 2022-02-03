import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d111 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int n) {
		int r =(int) Math.sqrt(n);
		if(r - Math.sqrt(n) == 0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n  = sc.nextInt();
			if(n == 0) {
				System.exit(0);
			}
			solve(n);
		}
	}	

}
