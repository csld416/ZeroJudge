import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d659 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int kase = 1;

	public static void solve(int a[]) {
		int ans = 0;
		Arrays.sort(a);
		ans = a[1];
		System.out.println("Case "+kase+": "+ans);
		kase++;
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n-- > 0) {
			int a[] = new int[3];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			solve(a);
		}
	}

}
