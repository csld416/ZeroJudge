
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d550 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {

    }

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String r = sc.nextLine();
        String w[] = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] =sc.nextLine();
        }
        Arrays.sort(w);
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
    }

}
