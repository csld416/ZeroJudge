import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class d566 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(ArrayList<String> stack) {
		String w[] = new String[stack.size()];
		for (int i = 0; i < w.length; i++) {
			w[i] = stack.get(i);
		}
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> ac = new ArrayList<>();
		double sum = 0;
		double mother = 0;

		for (int i = 0; i < w.length; i++) {
			String e[] = w[i].split("\\s");
			if (e[1].equals("AC") && !list.contains(e[0])) {
				if(!ac.contains(e[0])) {
					ac.add(e[0]);
					sum++;
				}else {
					mother++;
				}
			} else {
				list.add(e[0]);
			}
		}
		double ans = sum / mother / 1.0 * 100;
		String t = Double.toString(ans).replace(".0", "");
		System.out.println(t+"%");
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> stack = new ArrayList<>();
		while (n-- > 0) {
			stack.add(br.readLine());
		}
		solve(stack);
	}

}
