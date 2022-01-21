
import java.util.ArrayList;
import java.util.Scanner;

public class c291 {

    static int[] Parent;
    static int Number[];
    static int Ans = 0;

    static void Unite(int x, int y) {
        x = Find(x);
        y = Find(y);
        if (x <= y) {
            Parent[y] = x;
        } else {
            Parent[x] = y;
        }
    }

    static int Find(int x) {
        if (Parent[x] == x) {
            return x;
        }
        return Parent[x] = Find(Parent[x]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Parent = new int[n];
            Number = new int[n];
            for (int i = 0; i < n; i++) {
                Parent[i] = i;
            }

            for (int x = 0; x < n; x++) {
                int y = sc.nextInt();
                Unite(x, y);
            }
            for (int i = 0; i < n; i++) {
                Find(i);
            }
            for (int i = 0; i < n; i++) {
                if (Parent[i] == 1) {
                    Ans++;
                }
            }
            System.out.println(Ans);
            Ans = 0;
        }
    }

}
