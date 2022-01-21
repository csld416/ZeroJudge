
import java.math.BigInteger;
import java.util.Scanner;

public class a738 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // BigInteger bigint = new BigInteger();
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String[] w = {Integer.toString(a), Integer.toString(b)};
            BigInteger bigint1 = new BigInteger(w[0]);
            BigInteger bigint2 = new BigInteger(w[1]);
            System.out.println(bigint1.gcd(bigint2));
        }
    }

}
