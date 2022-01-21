
import java.util.Scanner;

public class d532 {

    protected static void solve(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                sum++;
            }

        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            solve(a, b);
        }
    }

}
