import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve() {

	}

	public static void main(String[] args) {
		String s = sc.nextLine();
		String w[] = s.split("\\s+");
		System.out.println(Arrays.toString(w));
		String input = w[0];
		int a =Integer.parseInt(w[1]);
		int b = Integer.parseInt(w[2]);
	}
}
