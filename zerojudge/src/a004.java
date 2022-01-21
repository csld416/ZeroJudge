
import java.util.Scanner;

public class a004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String w[] = input.split("\\n");
            int a[] = new int[w.length];
            for (int i = 0; i < w.length; i++) {
                a[i] = Integer.parseInt(w[i]);
                if (a[i] % 4 != 0) {
                    System.out.println("平年");
                }
                if (a[i] % 4 == 0) {
                    if (a[i] % 100 != 0) {
                        System.out.println("閏年");
                    }
                }
                if (a[i] % 100 == 0) {
                    if (a[i] % 400 != 0) {
                        System.out.println("平年");
                    }
                }
                if (a[i] % 400 == 0) {
                    System.out.println("閏年");
                }
            }
        }

    }

}
