
import java.util.Arrays;
import java.util.Scanner;

public class a006 {

    /**
     * a[0] -> a a[1] -> b a[2] -> c
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[] = new int[2];
        int a[] = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        double d = a[1] * a[1] - 4 * a[0] * a[2];
        if (d < 0) {
            System.out.println("No real root");
            System.exit(0);
        }
        b[0] = degx(a);
        b[1] = degy(a);
        Arrays.sort(b);
        if (b[0] != b[1]) {
            System.out.println("Two different roots x1=" + b[1] + " , x2=" + b[0]);
        } else {
            System.out.println("Two same roots x=" + b[0]);
        }
    }

    static int degx(int a[]) {
        int x = 0;
        double d = a[1] * a[1] - 4 * a[0] * a[2];
        x = ((a[1] * -1) + (int) Math.pow(d, 0.5)) / 2 * a[0];
        return x;
    }

    static int degy(int a[]) {
        int y = 0;
        double d = a[1] * a[1] - 4 * a[0] * a[2];
        y = ((a[1] * -1) - (int) Math.pow(d, 0.5)) / 2 * a[0];
        return y;
    }
}
