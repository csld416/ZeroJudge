import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a915 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve() {
		
	}
	
	public static void main(String[] args) {
		int k = sc.nextInt();
		while(k-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.printf("%02hd:%02hd",(n+2+(m+30)/60)%24,(m+30)%60);
		}

	}
	static class t {
		int a;
		int b;
	}
}
