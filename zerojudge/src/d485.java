
import java.util.Scanner;
import static java.lang.System.out;

public class d485 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a % 2 != 0) && (b % 2 != 0)) {
                System.out.println((b - a) / 2);
            } else {
                System.out.println((b - a) / 2 + 1);
            }
        }
    }

}
