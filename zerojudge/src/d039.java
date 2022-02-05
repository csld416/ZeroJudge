import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d039 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a, int b) {
		System.out.println((a/3)*(b/3));
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			solve(a, b);
		}
	}

}
