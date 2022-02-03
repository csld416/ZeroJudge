import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b917 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int g = 1;
	static long ans, mul;
	static int n;
	static int a[] = new int[20];
	public static long solve(int a[]) {
		ans = 0;
        for (int i = 0; i < n; i++){
            mul = 1;
            for (int j = i; j < n; j++){
                mul *= a[j];
                ans = Math.max(ans, mul);
            }
        }
		return ans;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.print("Case #" + g + ": The maximum product is " + solve(a) + ".");
			System.out.println();
			System.out.println();
			g++;
		}
	}

}
