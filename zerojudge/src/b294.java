
import java.util.Scanner;

public class b294 {

    static int solve(int[] arr) {
        int sum = 0, tmp = 1;
        for (int i = 0, k = 1; i < arr.length; i++, k++) {
            sum += (k*arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(solve(a));
        }
    }

}
