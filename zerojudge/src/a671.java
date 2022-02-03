import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a671 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(double n, double p) {
		double e = Math.E;
		System.out.printf("%d\n", (int)(Math.pow(e, Math.log(p)/n) + 0.5));
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			double a  = sc.nextDouble();
			double b = sc.nextDouble();
			solve(a, b);
		}
	}

}
