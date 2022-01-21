
import java.util.Scanner;

public class a111 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                System.exit(0);
            } else {
                int[] a = new int[1000];
                for (int i = 0, j = 1; i < a.length; i++, j++) {
                    a[i] = (int) Math.pow(j, 2);
                }
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i];
                }
                System.out.println(sum);
            }

        }

    }
}
