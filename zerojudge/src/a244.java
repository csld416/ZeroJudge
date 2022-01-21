
import java.util.Scanner;

public class a244 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n;
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a;
                long b, c;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println((b + c));
                        break;
                    case 2:
                        System.out.println((b - c));
                        break;
                    case 3:
                        System.out.println((b * c));
                        break;
                    case 4:
                        System.out.println((b / c));
                        break;
                }
            }
        }
    }

}
