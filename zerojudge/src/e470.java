
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class e470 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n) {
        double sum = 0;
        if (n <= 100) {
            for (int i = 1; i <= n; i++) {
                sum += (1.0 / i);
            }
            System.out.println(Math.round(sum * 1000.0) / 1000.0);
        } else {
            /*BigDecimal d = new BigDecimal("0.5772156649");
            BigDecimal bigsum = new BigDecimal(Double.toString(Math.log1p(n)));
            BigDecimal ans = d.add(bigsum);
            MathContext mc = new MathContext(4);
            System.out.println(ans.round(mc));
            */
            System.out.println(Math.round((Math.log1p(n)+0.5772156649)*10000.0)/10000.0);
        }
    }

    public static void main(String[] args) throws IOException {
        // int n = Integer.parseInt(br.readLine());
        while (sc.hasNext()) {
            int n = sc.nextInt();
            solve(n);

        }

    }

}
