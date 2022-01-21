
import java.util.Scanner;

public class a059 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int y[] = new int[2];
            int sum = 0;
            for (int j = 0; j < y.length; j++) {
                y[j] = sc.nextInt();
            }
            for (int j = y[0]; j <= y[1]; j++) {
                if (Math.sqrt(j) % 1 == 0) {
                    sum += j;
                }
            }

            System.out.println("Case " + i + ": " + sum);
        }
    }

}
