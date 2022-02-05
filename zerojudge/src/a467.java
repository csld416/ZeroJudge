import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a467 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static ArrayList<String> str = new ArrayList<>();

	public static void solve() {
		int ans = 0;
		int flag = 0;
		for (int i = 0; i < str.size(); ++i) {
			int len = str.get(i).length();
			if (len == 1) {
				flag = 1;
			} else if (len == 2) {
				flag = 0;
			} else {
				for (len -= 2; len > 0; len--)
					ans = (ans << 1) | flag;
			}
		}
		String e = Integer.toString(ans);
		System.out.println(Integer.parseInt(e, 2));

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			str.clear();
			String s = sc.next();
			if (s.equals("~")) {
				System.exit(0);
			}
			if (s.equals("#")) {
				solve();
			} else {
				str.add(s);
			}
		}
	}

}
