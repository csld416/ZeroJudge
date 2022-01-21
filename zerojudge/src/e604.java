
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class e604 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        //BigInteger n = new BigInteger(s);
        int n = Integer.parseInt(s);
        //System.out.println(BigInteger.valueOf(2).multiply(BigInteger.valueOf(3).pow(n-1)).subtract(BigInteger.ONE));
        ArrayList<BigInteger> list = new ArrayList<>();
        list.add(BigInteger.ONE);
        for (int i = 1; i <= n; i++) {
            list.add(list.get(i - 1).multiply(BigInteger.valueOf(3)).add(BigInteger.ONE.add(BigInteger.ONE)));
        }
        System.out.println(list.get(n));
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            String s = sc.nextLine();
            solve(s);
        }

    }

}
