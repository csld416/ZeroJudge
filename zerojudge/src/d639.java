
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class d639 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        int n = Integer.parseInt(s);
        long a[] = new long[n];
        for (int i = 0; i < 3; i++) {
			a[i] = 1;
			
		}
        for (int i = 3; i < a.length; i++) {
			a[i] = (a[i-1] + a[i-2] + a[i-3])%10007;
		}
        System.out.println(a[n-1]);
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
// 1 1 1 ,,,3,5,7,15,27,49,91,
