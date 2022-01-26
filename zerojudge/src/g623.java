import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class g623 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int a[]) {
		
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		while(n-- > 0) {
			int m = sc.nextInt();
			int arr[] = new int[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			solve(arr);
		}

	}

}
