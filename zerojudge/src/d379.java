import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d379 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("\\s");
		int a = Integer.parseInt(w[0], 16);
		int b = Integer.parseInt(w[2], 16);
		String a1 = Integer.toBinaryString(a);
		String b1 = Integer.toBinaryString(b);
		
		StringBuilder s1 = new StringBuilder(a1);
		StringBuilder s2 = new StringBuilder(b1);
		while(s1.length() < 13) {
			s1.insert(0, "0");
		}
		while(s2.length() < 13) {
			s2.insert(0, "0");
		}
		if(w[1].charAt(0) == '+') {
			System.out.println(s1 + " + " + s2 + " = " + (a+b));
		}else {
			System.out.println(s1 + " - " + s2 + " = " + (a-b));
		}
	}

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			solve(s.toLowerCase());
		}
	}

}
