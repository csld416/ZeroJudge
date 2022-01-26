import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Module {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(String s) {
		System.out.println(ans(s));
	}
	public static String ans(String s) {
		if(s.length() == 1) {
			return s;
		}else {
			String w[] = s.split("");
			int a[] = new int[w.length];
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(w[i]);
			}
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return ans(Integer.toString(sum));
		}
	}
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}

	}

}
