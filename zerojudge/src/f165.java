
import java.util.Scanner;

public class f165 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a != 0 && b != 0) {
                System.out.println(a % b == 0 ? "OK!" : a % b);
            }else{
                System.out.println("OK");
            }
        }
    }

}
