
import java.util.Scanner;

public class a042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int out = 2;
            a--;
            out += a*(4 + 2*(a - 1))/2;
            System.out.println(out);
        }

    }

}
