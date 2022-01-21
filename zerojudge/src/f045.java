
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class f045 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        boolean id;
        String w[] = s.split("");
        Arrays.sort(w);
        int a = (int) Math.pow(Integer.parseInt(w[w.length - 1]), 2);
        int b = (int) Math.pow(Integer.parseInt(w[w.length - 2]), 2);
        String ss = "";
        for (int i = 6; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
               // if (s.charAt(i) != '0') {
                    ss += s.charAt(i);

               // }
            }
        }
        int n = Integer.parseInt(ss);
        if (a + b == n) {
            id = true;
        }else{
            id = false;
        }
        System.out.println(id == true ? "Good Morning!" : "SPY!");
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
