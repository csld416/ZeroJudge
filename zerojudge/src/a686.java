import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a686 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int height, int climb, int drop) {
		if (climb >= height)
			System.out.println("1");
		else if (drop >= climb)
			System.out.println("Poor Snail");
		else
			System.out.printf("%d\n", (int)(Math.ceil(1.0 * (height - climb) / (climb - drop))) + 1);
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		while (n-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			solve(x, y, z);
		}
	}

}
