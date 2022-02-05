import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class b304 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static boolean isMatched(String s) {
		final String opening = "([";
		final String closing = ")]";
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (opening.indexOf(c) != -1) {
				stack.push(c);
			} else if (closing.indexOf(c) != -1) {
				if (stack.isEmpty()) {
					return false;
				}
				if (closing.indexOf(c) != opening.indexOf(stack.pop())) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void solve(String s) {
		System.out.println(isMatched(s) == true ? "Yes" : "No");
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			solve(s);
		}
	}

}
