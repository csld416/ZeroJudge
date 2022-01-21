
import java.util.*;
import static java.lang.System.out;
import java.math.BigInteger;

public class a012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String aa = sc.nextLine();
            String[] w = aa.split(" ");
            BigInteger x = new BigInteger(w[0]);
            BigInteger y = new BigInteger(w[1]);
            out.println((x.subtract(y)).abs());
        }
    }

}
