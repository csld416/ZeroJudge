import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class f929 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve() {

	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		int o = sc.nextInt();
		while (o-- > 0) {
			int x = sc.nextInt();
			if (x == 1) {
				int y = sc.nextInt();
				if (a.contains(0)) {
					A: for (int i = 0; i < n; i++) {
						if (a.get(i) == 0) {
							a.set(i, y);
							break A;
						}
					}

				}
			} else if (x == 2) {
				int y = sc.nextInt();
				a.set(y, 0);
			} else if (x == 3) {
				if (a.contains(0)) {
					B: for (int i = 0; i < a.size(); i++) {
						if (a.get(i) == 0) {
							System.out.println(i);
							break B;
						}
					}
				} else {
					System.out.println("-1");
				}
			}
		}

	}
}
