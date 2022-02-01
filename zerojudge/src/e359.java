import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e359 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int g = 250000000;

	public static void solve(int a[]) {

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			if (n == 1) {
				int buffer = Integer.parseInt(sc.next());
				System.out.println(buffer);
			} else {
				String s = sc.nextLine();
				System.out.println("0");
			}

		}
	}

}
