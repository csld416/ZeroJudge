import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d681 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s");
		int n;
		for (int i = 0; i < w.length; i++) {
			if(!w[i].equals("or") && !w[i].equals("and")) {
				n = Integer.parseInt(w[i], 2);
			}
		}
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}

	}

}
