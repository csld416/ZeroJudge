
import java.io.IOException;
import java.util.Scanner;

public class d060 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 25) {
                System.out.println("0");
            } else {
                System.out.println(n < 25 ? 25 - n : 60 - n + 25);

            }
        }
    }

}
