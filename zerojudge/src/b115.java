
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class b115 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s1, String op, String s3) {
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s3);

        switch (op) {
            case "+":
                System.out.println(a.add(b));
                break;
            case "-":
                System.out.println(a.subtract(b));
                break;
            case "*":
                System.out.println(a.multiply(b));
                break;
            case "/":
                System.out.println(a.divide(b));
                break;
        }

    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            String s3 = sc.nextLine().trim();
            solve(s1, s2, s3);
        }

    }

}
