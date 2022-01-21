
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class c561 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s, int n) {
        String w[] = s.split("\\s");
        String in[] = new String[w.length];
        Integer a[] = new Integer[n];
        for (int i = 0; i < w.length; i++) {
            in[i] = inverse(w[i]);
            a[i]= Integer.parseInt(in[i]);
        }
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
    }

    public static String inverse(String in) {
        String ans = "";
        String w[] = in.split("");
        for (int i = w.length - 1; i > -1; i--) {
            ans += w[i];
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        solve(s, n);
    }

}
