
import java.util.Scanner;

public class a149 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int n = Integer.parseInt(t);
        for (int j = 1; j <= n; j++) {
            String input = sc.nextLine();
            String w[] = input.split("");
            int sum = 1;
            int a[] = new int[w.length];
            for (int u = 0; u < w.length; u++) {
                a[u] = Integer.parseInt(w[u]);
            }
            for (int i = 0; i < a.length; i++) {
                sum *= a[i];
            }
            System.out.println(sum);
        }

    }

}
