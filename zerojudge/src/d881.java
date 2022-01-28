import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d881 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int d) {
		long ans =1275 + d * 19600;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			solve(n);
		}

	}

}
