
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e948 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s");
        int a[] = new int[w.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        double bmr;
        if (a[0] == 1) {//boy
            bmr = (13.7 * a[3]) + (5.0 * a[2]) - (6.8 * a[1]) + 66;
            System.out.printf("%.2f\n", bmr);
        } else {
            bmr = (9.6 * a[3]) + (1.8 * a[2]) - (4.7 * a[1]) + 655;
            System.out.printf("%.2f\n", bmr);
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            solve(s);
        }
    }

}
