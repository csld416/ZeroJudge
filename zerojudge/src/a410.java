import java.util.Scanner;

public class a410 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a, b, c, d, e, f;
            int temp;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            f = sc.nextInt();
            temp = a * e - b * d;
            if (temp == 0) {
                if (c * d == a * f) {
                    System.out.println("Too many\n");
                } else {
                    System.out.println("No answer\n");
                }
            } else {
                System.out.println("x=" + String.format("%.2f", (double) (c * e - b * f) / temp));
                System.out.println("y=" + String.format("%.2f", (double) (c * d - a * f) / -temp));
            }
        }
    }

}
