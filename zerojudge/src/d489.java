
import java.util.Scanner;

public class d489 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(area(a, b, c));
        }
    }

    static int area(int a, int b, int c) {
        int d = (int) (a + b + c) / 2;
        // return (int)d;
        return (d * (d-a) * (d-b) * (d-c));

    }

}
