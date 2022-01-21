
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class d646 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s, String ss) {
       BigInteger a1 = new BigInteger(Integer.toString(Integer.parseInt(s, 2)));
       BigInteger b1 = new BigInteger(Integer.toString(Integer.parseInt(ss, 2)));
       BigInteger c = a1.gcd(b1);
        System.out.println(Integer.toBinaryString(c.intValue()));
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String ss = br.readLine();
        solve(s, ss);
    }

}
