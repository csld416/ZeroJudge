import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c276 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;

	public static void solve(String ans) throws IOException {
		n = Integer.parseInt(br.readLine());
		String w[] = ans.split("");
		while (n-- > 0) {
			String input = br.readLine();
			String match[] = input.split("");
			int a = 0;
			int b = 0;
			for (int i = 0; i < 4; i++) {
				if (w[i].equals(match[i])) {
					a++;
				} else {
					if (w[i].equals(match[0])) {
						b++;
					}
					if (w[i].equals(match[1])) {
						b++;
					}
					if (w[i].equals(match[2])) {
						b++;
					}
					if (w[i].equals(match[3])) {
						b++;
					}
				}

			}
			System.out.println(a + "A" + b + "B");
		}

	}

	public static void main(String[] args) throws IOException {
		String ans = br.readLine();
		solve(ans);
	}

}
