
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class c268 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(ArrayList<Integer> a) {
        Collections.sort(a);
        boolean ap = false;
        if (a.size() > 44) {
            ap = true;

        } else {
            for (int i = 2; i < a.size(); i++) {
                if (a.get(i - 2) + a.get(i - 1) > a.get(i)) {
                    ap = true;
                    break;
                }
            }
            System.out.println(ap == true ? "YES" : "NO");
        }
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (n-- > 0) {
                int t = sc.nextInt();
                ArrayList a = new ArrayList<>();
                for (int i = 0; i < t; i++) {
                    a.add(sc.nextInt());
                }
                solve(a);
            }
        }

    }

}
