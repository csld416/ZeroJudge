
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c024 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve() {


	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			long n = sc.nextLong();
			if(n < 0) {
				System.exit(0);
			}
			System.out.println(1+(1+n)*n/2);
		}
	}

}

