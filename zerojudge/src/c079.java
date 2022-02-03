import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c079 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int a, int b) {
		int ans = 0;
		if(a % b != 0) {
			ans = a + a/b;
		}else {
			ans = a+ a/b-1;
		}
		ans = a+a/b+(a/b+a%b)/b;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			solve(a, b);
		}
	}

}
