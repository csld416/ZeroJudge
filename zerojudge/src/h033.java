
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class h033 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split(" ");
        w[0] = w[0].replaceAll(w[1], "");
        System.out.println(check(w[0]) == true ? "Yes" : "No");
    }

   public static boolean check(String s) {
        String w[] = s.split("");
        String ss = "";
        for (int i = w.length-1; i > -1; i--) {
            ss += w[i];
        }
        if (ss.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
