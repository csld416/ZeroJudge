
import static java.lang.Integer.max;
import java.util.Scanner;

public class a158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                String w = sc.nextLine().trim();
                int num[] = num(w);
                int ans = 1;
                for (int j = 0; j < num.length; j++) {
                    for (int k = j+1; k < num.length; k++) {
                        ans = max(ans, gcd(num[j],num[k]));
                    }
                }
                System.out.println(ans);
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : gcd(b, a % b);
    }
    public static int[] num(String s){
        String s1 = s.trim().replaceAll("\\s+", " ");
        String w[] = s1.split(" ");
        int a[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        return a;
    }
}
