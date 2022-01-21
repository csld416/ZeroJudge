
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class a054 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        int tt[] = {10, 11, 12, 13, 14, 15, 16, 17,
            34, 18, 19, 20, 21, 22, 35, 23,
            24, 25, 26, 27, 28, 29, 32, 30, 31, 33};
        String w[] = s.split("");
        int a[] = new int[w.length - 1];
        int sum = 0;
        for (int i = 0, j = 8; i < a.length; i++, j--) {
            a[i] = Integer.parseInt(w[i]);
            sum += a[i] * j;
        }
        for (int i = 0; i < tt.length; i++) {
            int token = ((tt[i] % 10) * 9 + (tt[i] / 10) + sum);
            token = token % 10;
            int key = Integer.parseInt(w[w.length - 1]);
            int k = 10 - token;
            if(10 - token == 10){
                k = 0;
            }
            if (k == key) {
                System.out.print((char) (i + 65));
            }

        }

    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
