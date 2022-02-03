import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class a565 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		s = s.replace(".", "");
		final char p = 'p';
		final char q = 'q';
		Stack<Character> buffer = new Stack<>();
		int num = 0;
		for (char c : s.toCharArray()) {
			if (c == p) {
				buffer.push(p);
			} else if (c == q && !buffer.isEmpty()) {
				buffer.pop();
				num++;
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			solve(s);
		}
	}

}
