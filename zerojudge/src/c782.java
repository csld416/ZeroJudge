
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c782 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int[] a, int[] w, int k) {
        long s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] - a[j] > k){
                    s += w[i]*w[j];
                }
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int w[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }
            solve(a,w,k);
        }
    }

}
