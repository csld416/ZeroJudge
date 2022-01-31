import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class c562 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("");
		int sum = 0;
		for (int i = 0; i < w.length; i++) {
			if (w[i].equals("0")) {
				sum++;
			} else if (w[i].equals("6") || w[i].equals("9")) {
				sum++;
			} else if (w[i].equals("8")) {
				sum += 2;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) throws IOException {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}
