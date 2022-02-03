import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a132 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(int n) {
		String s = Integer.toBinaryString(n);
		int sum = 0;
		for (char c : s.toCharArray()) {
			if(c == '1') {
				sum++;
			}
		}
		
		System.out.println("The parity of " + s + " is "+sum+" (mod 2).");
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				System.exit(0);
			}
			solve(n);
		}
	}

}
