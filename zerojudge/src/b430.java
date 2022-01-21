
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class b430 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s");
        String a = w[0], b = w[1], n = w[2];
        BigInteger bg1 = new BigInteger(a);
        BigInteger bg2 = new BigInteger(b);
        BigInteger m = new BigInteger(n);
        System.out.println((bg1.multiply(bg2)).mod(m));
        
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            String s = sc.nextLine();
            solve(s);
        }
    }

}
