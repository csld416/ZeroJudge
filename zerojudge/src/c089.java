import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c089 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(String s) {
		String w[] = s.split("\\s+");
		String input = w[0];
		int convert =Integer.parseInt(w[1]);
		int output = Integer.parseInt(w[2]);
		
		int tmp = Integer.parseInt(input, convert);
		System.out.println();

	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}
