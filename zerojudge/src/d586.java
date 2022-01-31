import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d586 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static String num_to_abc = "mjqhofawcpnsexdkvgtzblryui";
	static String abc_to_num = "uzrmatifxopnhwvbslekycqjgd";
	static {

	}

	public static void solve(String w[]) {
		if (Character.isAlphabetic(w[0].charAt(0))) {
			int sum = 0;
			Arrays.sort(w);
			for (int i = 0; i < w.length; i++) {
				for (int j = 0; j < abc_to_num.length(); j++) {
					if (w[i].equals(Character.toString(abc_to_num.charAt(j)))) {
						sum += (j + 1);
					}
				}

			}
			System.out.println(sum);
		} else {
			int a[] = new int[w.length];
			for (int i = 0; i < w.length; i++) {
				a[i] = Integer.parseInt(w[i])-1;
			}
			StringBuilder ans = new StringBuilder();
			for (int i = 0; i < a.length; i++) {
				ans.append(num_to_abc.charAt(a[i]));
			}
			System.out.println(ans);
		}
		

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			int l = Integer.parseInt(sc.next());
			String w[] = new String[l];
			for (int i = 0; i < w.length; i++) {
				w[i] = sc.next();
			}
			solve(w);
		}
	}

}
