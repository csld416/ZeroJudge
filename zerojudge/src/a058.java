
import java.util.Scanner;

public class a058 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int x[] = {0, 0, 0};
        for (int i = 0; i < num.length; i++) {
            int a = sc.nextInt();
            switch (a % 3) {
                case 0:
                   // System.out.println("0");
                    x[0]++;
                    break;
                case 1:
                  //  System.out.println("1");
                    x[1]++;
                    break;
                case 2:
                  //  System.out.println("2");
                    x[2]++;
                    break;
            }
        }
        System.out.println(x[0] + " " + x[1] + " " + x[2]);

    }

    static int mac(int arr) {

        return 0;
    }
}
