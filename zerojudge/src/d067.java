
import java.util.Scanner;

public class d067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int y = sc.nextInt();
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                System.out.println("a leap year");
            } else {

                System.out.println("a normal year");
            }
        }
    }

}
