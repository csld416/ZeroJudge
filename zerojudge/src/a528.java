
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class a528 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
         //   String[] w = new String[n];
            BigInteger[] se = new BigInteger[n];
            for (int i = 0; i < n; i++) {
         //       w[i] = sc.nextLine();
                se[i] = new BigInteger(sc.nextLine());
            }
            Arrays.sort(se);
            for (int i = 0; i < se.length; i++) {
                System.out.println(se[i]);
            }
        }

    }

}
