import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d681 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String output = s;
		String w[] = s.split("\\s");
		String ans = "";

		// convert the binary to ten_
		for (int i = 0; i < w.length; i += 2) {
			w[i] = Integer.toString(Integer.parseInt(w[i], 2));

		}
		int a = Integer.parseInt(w[0]);
		for (int i = 1; i < w.length; i += 2) {
			int next = Integer.parseInt(w[i + 1]);
			if (w[i].equals("and")) {
				a = a & next;
			} else {
				a = a | next;
			}
		}
		output = output.replaceAll(" or ", "||");
		output = output.replaceAll(" and ", "&&");
		output += "= ";
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toBinaryString(a));
		while (sb.length() != 5) {
			sb.insert(0, "0");
		}
		System.out.println(output + sb);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}

	}

}
