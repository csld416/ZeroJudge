import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e625 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s+");
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < w.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (char c : w[i].toCharArray()) {
				sb.append(c);
			}
			sb = sb.reverse();
			sb.append(" ");
			ans.append(sb);
		}
		System.out.println(ans);

	}

	public static void main(String[] args) throws IOException {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}
