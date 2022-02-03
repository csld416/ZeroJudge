import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b516 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String plain) {
		StringBuilder cipher = new StringBuilder();
		for (int i = 0; i < plain.length(); i++) {
			cipher.append((char)((plain.charAt(i) + 3 - 65) % 26 + 65));
		}
		System.out.println(cipher);
	}

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			String s = br.readLine();
			solve(s);
		}
	}

}
