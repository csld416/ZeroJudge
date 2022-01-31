import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class d623 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static ArrayList<Double> ans = new ArrayList<>();

	public static void solve(int arr[]) {
		ans.clear();
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		int d = arr[3];
		if(clarma(a, b, c, d)==0) {
			System.out.println("cheat!");
			return;
		}
		// =========================
		solve_equation(a, b, 1, c, d, 0);
		solve_equation(a, b, 0, c, d, 1);
		double output[] = new double[4];
		output[0] = ans.get(0);
		output[1] = ans.get(2);
		output[2] = ans.get(1);
		output[3] = ans.get(3);
		System.out.printf("%.5f %.5f\n%.5f %.5f\n", output[0], output[1], output[2], output[3]);
	}

	public static double clarma(int a, int b, int c, int d) {
		return a * d - b * c;
	}

	public static void solve_equation(int a, int b, int c, int d, int e, int f) {
		double delta = clarma(a, b, d, e);
		double delta_x = clarma(c, b, f, e);
		double delta_y = clarma(a, c, d, f);
		double x = delta_x / delta;
		double y = delta_y / delta;
		ans.add(x);
		ans.add(y);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int a[] = new int[4];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				if(a[0]==0) {
					System.exit(0);
				}
			}
			if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0) {
				System.exit(0);
			}
			solve(a);
		}
	}

}
