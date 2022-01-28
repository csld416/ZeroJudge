import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class a915 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve() {

	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		Vector<Integer> v = new Vector<>();
		int a[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				v.add(a[j][i]);
			}
			Collections.sort(v);
			for (int j = 0; j < n; j++) {
				a[j][i] = v.get(j);
			}
			v.
			v.removeAll(v);
		}
		System.out.println(v);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
