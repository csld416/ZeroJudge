import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d626 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean poor = false;
	public static void solve(String w[]) {
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < w[i].length(); j++) {
				if(w[i].charAt(j) == '+') {
					poor = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		String w[] = new String[n];
		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextLine();
		}
		String e = sc.nextLine();
		solve(w);
		
	}

}
