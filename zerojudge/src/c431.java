import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c431 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve() {

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		int a[] = new int[101];
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			a[k]++;
		}
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < a[i]; j++) {
				System.out.printf("%d ", i);
			}
		}
	}

}
