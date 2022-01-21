
import java.util.Arrays;
import java.util.Scanner;

public class d511 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int sum = 0;
            int[] a = new int[3];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[j] = sc.nextInt();
                }
                Arrays.sort(a);
                
                if (a[0] + a[1] > a[2]) {
                    sum++;
                }

            }
            System.out.println(sum);
        }
    }

}
