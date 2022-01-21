
import java.util.Scanner;

public class a215 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0, a = 0;
            for (int i = n; sum <= m;i++) {
                if (sum > m) {
                    break;
                } else {
                    a++;
                    sum += i;
                    continue;
                }
            }
            if(a == 0){
                a = 1;
            }
            System.out.println(a);
        }
    }

}
