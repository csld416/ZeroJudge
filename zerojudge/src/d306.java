
import java.util.Scanner;

public class d306 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine().trim());
            for (int i = 0; i < 2 * n; i++) {
                String a1 = sc.nextLine().trim();
                String b1 = sc.nextLine().trim();
                int a = Integer.parseInt(a1, 2);
                int b = Integer.parseInt(b1, 2);
                if (gcd(a, b) > 1) {
                    System.out.println("Pair #" + i+1 + ": All you need is love!");
                } else if (gcd(a, b) == 1) {
                    System.out.println("Pair #" + i+1 + ": Love is not all you need!");
                }
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : gcd(b, a % b);
    }

}
