
import java.util.Scanner;

public class d693 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                System.exit(0);
            } else {
                long c, ans = 1;
                for (int i = 0; i < n; i++) {
                    c = Math.abs(sc.nextLong());
                    ans = ans * c / gcd(c, ans);
                }
                System.out.println(ans);
            }
        }

    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : gcd(b, a % b);
    }
/*
    public static int ggcd(long[] arr, long idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int a = arr[idx];
        int b = ggcd(arr, idx + 1);
        return gcd(a, b);
    }*/
}


