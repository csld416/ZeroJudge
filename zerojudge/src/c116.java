import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c116 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(String s) {
		String w[] = s.split("\\s");
		double d[] = new double[w.length];
		for (int i = 0; i < d.length; i++) {
			d[i] = Double.parseDouble(w[i]);
		}
		
 
	}
	public static double length() {
		
		return 0;
	}
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String s  = sc.nextLine();
			solve(s);
		}
	}

}
