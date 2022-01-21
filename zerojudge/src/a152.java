
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class a152 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int a[], int n) {
        int f = Arrays.binarySearch(a, n);
        System.out.println(f);
    }

    public static void main(String[] args) throws IOException {
       int n = sc.nextInt();
       int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        solve(a, key);
    }

}
