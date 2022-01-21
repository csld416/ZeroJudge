
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class c669 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        int m, d = 0;
        String w[] = s.split("\\s+");
        int a[] = new int[w.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        Arrays.sort(a);
        int sum_false = 0;
        for (int i = 0; i < a.length; i++) {
            sum_false += a[i];
        }
        int sum_true = (a[0] + a[a.length - 1]) * a.length / 2;
        int dr = sum_false - sum_true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] - a[i - 1] == 0) {
                d = a[i];
                break;
            }
        }
        System.out.println(d-dr + " " + d);
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            solve(s);
        }
    }

}
