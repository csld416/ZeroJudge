import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class f669 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length()-1; i >-1; --i) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws IOException{
		String s  = br.readLine();
		solve(s);
	}

}
