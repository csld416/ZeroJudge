
import java.util.Scanner;

public class d570 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String w[] = s.trim().split("");
            int a = s.length();
            for (int i = 0; i < s.length(); i++) {

                for (int j = 0; j < a; j++) {
                    System.out.print(w[j]);
                }
                a--;
                System.out.println();
            }
        }
    }

}
