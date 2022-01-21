
import java.util.Scanner;

public class a005 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t;
        int a[] = new int[4];
        t = sc.nextInt();
        while (t-- != 0) {
            for (int i = 0; i < a.length; i++) {
                 a[i] = sc.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                 System.out.print(a[i] + " ");
            }
            if (a[0] + a[2] == 2 * a[1] && a[1] + a[3] == 2 * a[2]) {
                System.out.println(2 * a[3] - a[2]);
            } else {
                System.out.println(a[3]* a[3] / a[2]);
            }
        }
    }
}
