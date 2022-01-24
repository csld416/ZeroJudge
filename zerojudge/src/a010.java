 
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 頛詨�銝�銵����銝���嚗泵��� 憭扳1 銝� 撠蝑 100000000
 *
 * 頛詨隤芣�� �����銵撓���頛詨銝�����圾摮葡
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
