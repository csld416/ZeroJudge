
import java.util.Scanner;

public class a121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (check(i) == true) {
                    count++;
                } else {
                }
            }
            System.out.println(count);

        }

    }

    public static boolean check(int num) {
        boolean result = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return result;
    }
}
