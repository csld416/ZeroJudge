
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class d122 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        ArrayList<BigInteger> fac = new ArrayList<>();
        BigInteger one = new BigInteger("1");
        fac.add(one);
        for (int i = 2; i <= Integer.parseInt(s); i++) {
            one= one.multiply(BigInteger.valueOf(i));
        }
        BigInteger ten = new BigInteger("10");
        System.out.println(one.mod(ten));
       

    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
