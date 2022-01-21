
import java.util.Scanner;

public class g425 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String w[] = input.split("");
            String ans = "";
            for (int i = 0; i < w.length; i++) {
                if (i % 2 == 1) {
                    ans += w[i];
                }

            }
            System.out.println(ans);
        }

    }

}
