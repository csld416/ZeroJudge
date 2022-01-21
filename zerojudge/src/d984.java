
import java.util.Arrays;
import java.util.Scanner;

public class d984 {

    static void solve(long a, long b, long c) {
        if (a > b && a > c) {
            if (a > b + c) {
                System.out.println("A");
            } else {
                System.out.println(b > c ? "B" : "C");
            }
        } else if (b > a && b > c) {
            if (b > a + c) {
                System.out.println("B");
            } else {
                System.out.println(a > c ? "A" : "C");
            }
        } else {
            if (c > b + a) {
                System.out.println("C");
            } else {
                System.out.println(a > b ? "A" : "B");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long[] a = new long[3];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextLong();
            }
            solve(a[0], a[1], a[2]);
            //  Arrays.sort(a);
            //  System.out.println(a[0] + a[1] > a[2] ? "B" : "C");
        }
    }

}
