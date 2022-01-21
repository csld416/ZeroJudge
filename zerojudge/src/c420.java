
import java.util.Scanner;

public class c420 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aa = n;
        int a[] = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * i + 1;
        }
        for (int i = 0 ; i <aa; i++) {
            for (int j = n - 1; j > 0; j--) {
                System.out.print("_");
            }
            for (int j = 0; j < a[i]; j++) {
                System.out.print("*");
            }
            for (int j = n - 1; j > 0; j--) {
                System.out.print("_");
            }
            n--;
            System.out.println();
        }
    }

}
