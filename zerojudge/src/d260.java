import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d260 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s");
		int a[] = new int[w.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(w[i]);
		}
		Arrays.sort(a);
		if (a[0] == a[1] && a[1] == a[2] && a[2] == a[3]) {
			System.out.println("square");
		} else if (a[0] == a[1] && a[2] == a[3]) {
			System.out.println("rectangle");
		} else if (a[0] + a[1] + a[2] > a[3]) {
			System.out.println("quadrangle");
		} else {
			System.out.println("banana");
		}
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			solve(s);
		}
	}

}
