
import java.util.Scanner;

public class d070 {

    static String solve(int n) {
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            return "a leap year";
        } else {
            return "a normal year";
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int y = sc.nextInt();
            for (int i = 1; i <= y; i++) {
                int n = sc.nextInt();
                System.out.println("Case " + i + ": " + solve(n));
            }

        }
    }

}
