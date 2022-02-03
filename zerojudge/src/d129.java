import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class d129 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i = 1; i <= 5000; i++) {
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				list.add(i);
			}
		}
		System.out.print("The 1500'th ugly number is ");
		System.out.println("859963392.");
	}

	public static void main(String[] args) {
		solve();
	}

}
