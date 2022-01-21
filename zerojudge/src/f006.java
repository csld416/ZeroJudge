
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class f006 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s+");
        int a[] = new int[w.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        Arrays.sort(a);
        System.out.println(a[a.length-1] + " " + a[0]);
    }

    public static void main(String[] args) throws IOException {
        String t = br.readLine();
        String s = br.readLine();
        solve(s);
    }

}
