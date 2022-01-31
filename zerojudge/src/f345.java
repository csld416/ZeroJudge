import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class f345 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve() {


	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = Integer.parseInt(sc.nextLine());
			String s = sc.nextLine();
			String w[] = s.split("\\s");
			for (int i = w.length-1; i > -1; --i) {
				System.out.print(w[i] + " ");
			}
			System.out.println();
		}
	}

}
