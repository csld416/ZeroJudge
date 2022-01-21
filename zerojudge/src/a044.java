
import java.util.Scanner;

public class a044 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int out;
            out = (a*a*a+5*a+6)/6;
            System.out.println(out);
        }
    }

}
