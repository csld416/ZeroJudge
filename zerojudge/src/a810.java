
import java.math.BigInteger;
import java.util.Scanner;

public class a810 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String in = sc.nextLine();
            String[] r = in.split("\\s+");
            BigInteger[] bigint = new BigInteger[r.length];
            for (int i = 0; i < r.length; i++) {
                bigint[i] = new BigInteger(r[i]);
            }
            int sum = 0;
            for (long i = bigint[0].longValue(); i <= bigint[1].longValue(); i++) {
                if (i % bigint[2].longValue() == 0 || i % bigint[3].longValue() == 0) {
                    sum++;
                }

                if (i % gcd(bigint[2].longValue(), bigint[3].longValue()) == 0) {
                    sum--;
                }
            }
            System.out.println(sum);
        }

    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : gcd(b, a % b);
    }
    public static long lcm(long gcd){
        return 0;
}}
