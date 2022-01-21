
import java.util.Scanner;

public class c001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String[] a1 = a.split("");
            String[] b1 = b.split("");
            int count = 0;
            for (int i = 0; i < a1.length; i++) {
                A:
                for (int j = 0; j < b1.length; j++) {
                    if (a1[i].equals(b1[j])) {
                        count++;
                        break A;
                    }
                }
            }
            System.out.println(count);
        }

    }

}
