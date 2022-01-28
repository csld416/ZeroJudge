import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class d550 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve() {

	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Vector<Integer> v = new Vector<>();

				
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(a));
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				v.add(a[j][i]);
			}
			Collections.sort(v);
			for (int j = 0; j < n; j++) {
				a[j][i] = v.get(j);
			}
			v.removeAll(v);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
