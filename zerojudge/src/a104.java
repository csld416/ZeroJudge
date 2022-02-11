
import java.util.Arrays;
import java.util.Scanner;

public class a104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            int a[] = new int[t];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            String x = "";
            for (int i = 0; i < a.length; i++) {
                x += a[i] + " ";
            }
            x = x.trim();
            System.out.println(x);
        }

    }

}


