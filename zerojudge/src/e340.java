
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class e340 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s, int n) {
        String w[] = s.split("\\s");
        int b[] = new int[w.length];
        int a[] = new int[w.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(w[i]);
        }
        //==============================
        a[0] = b[0];
        for (int i = 1; i < b.length; i++) {
           a[i] = b[i] - b[i-1];
        }
        //===============================
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        solve(s, n);
    }

}
