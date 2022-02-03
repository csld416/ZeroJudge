import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c022 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a, int b) {
		long sum = 0;
		if(a %2 == 0) {
			a ++;
		}
		for (int i = a; i <= b; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		int u = 1;
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print("Case "+u+": ");
			solve(a, b);
			u++;
		}
	}

}
