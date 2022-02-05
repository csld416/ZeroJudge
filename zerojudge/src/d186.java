import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d186 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int a, int b) {
		if(a == 0 && b == 0) {
			System.exit(0);
		}
		int ans = 0;
		for (int i = a; i <= b; i++) {
			if(Math.sqrt(i) - (int)Math.sqrt(i) == 0) {
				ans++;
			}
		}
		System.out.println(ans);

	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			solve(a, b);
		}
	}

}
