import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c813 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static long solve(long a) {
		String s = Long.toString(a);
		if(s.length() == 1) {
			return a;
		}
		String w[] = s.split("");
		long sum = 0;
		for (int i = 0; i < w.length; i++) {
			sum += (Long.parseLong(w[i]));
		}
		return solve(sum);

	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			long a = sc.nextLong();
			if(a == 0) {
				System.exit(0);
			}
			System.out.println(solve(a));
		}
	}

}
