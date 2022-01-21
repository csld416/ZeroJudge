
import java.util.Scanner;

public class d064 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(n % 2 == 0 ? "Even" : "Odd");
        }
    }

}
