
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class g005 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        if (s.contains("+")) { //1234-5678
            String w[] = s.split("+");
            
        }
    }

    public static String reverse(String s) {
        s = new StringBuffer(s).reverse().toString();
        return s;
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
