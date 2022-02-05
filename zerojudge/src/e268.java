import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class e268 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static ArrayList<String> key = new ArrayList<>();
	static ArrayList<String> value = new ArrayList<>();
	static ArrayList<Character> aeiou = new ArrayList<>();
	static {
		aeiou.add('a');
		aeiou.add('e');
		aeiou.add('i');
		aeiou.add('o');
		aeiou.add('u');
	}
	public static void solve(String w[]) {
		String ans[] = new String[w.length];
		for (int i = 0; i < w.length; i++) {
			if (key.contains(w[i])) {
				int y = key.indexOf(w[i]);
				ans[i] = value.get(y);
			} else {
				StringBuilder sb = new StringBuilder(w[i]);
				int len = w[i].length();
				if (w[i].endsWith("y")) {
					char c = w[i].charAt(len - 2);
					if (aeiou.contains(c)) {
						sb.append("s");
					}else {
						sb.replace(len - 1, len + 1, "ies");
					}
				} else if (w[i].endsWith("o") || w[i].endsWith("s") || w[i].endsWith("ch") || w[i].endsWith("sh")
						|| w[i].endsWith("x")) {
					sb.append("es");
				} else {
					sb.append("s");
				}
				ans[i] = sb.toString();
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		while (n-- > 0) {
			key.add(sc.next());
			value.add(sc.next());
		}
		String[] enter = new String[m];
		String d = sc.nextLine();
		for (int i = 0; i < enter.length; i++) {
			enter[i] = sc.nextLine();
		}
		solve(enter);
	}

}
