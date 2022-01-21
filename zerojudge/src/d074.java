
import java.util.Arrays;
import java.util.Scanner;

public class d074 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int[] num = new int[a];
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }
            Arrays.sort(num);
            System.out.println(Arrays.toString(num));
            System.out.println(num[num.length - 1]);
        }
    }

}
