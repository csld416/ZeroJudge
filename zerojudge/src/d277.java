import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d277 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int n ) {
		if(n % 2 == 1) {
			System.out.println(n-1);
		}else {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			solve(n);
		}

	}

}
