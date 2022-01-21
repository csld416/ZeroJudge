
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 輸入共一行。每行包含一個整數，符合 大於1 且 小於等於 100000000
 *
 * 輸出說明 針對每一行輸入整數輸出一個因數分解字串
 */
public class a010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum, i;
        while (sc.hasNext()) {
            n = sc.nextInt();
            for (i = 2; i <= n; i++) {
                sum = 0;
                while (n % i == 0) {
                    sum++;
                    n = n / i;
                }
                if (sum > 1) {
                    System.out.print(i + "^" + sum);
                    if (n > 1) {
                        System.out.print(" * ");
                    }
                } else if (sum == 1) {
                    System.out.println(i);;
                    if (n > 1) {
                        System.out.print(" * ");
                    }
                }
                if (n == 1) {
                    System.out.println();
                    break;
                }
            }
        }
    }

}
