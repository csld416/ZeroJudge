
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a229 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    //static String s;
    static ArrayList<String> s = new ArrayList<>();
    public static void solve(int now, int nL, int nR) {
        if (now == 2 * N) {
            //total++;
            System.out.println(s);
            return;
        }
        if (nL < N) {
           s.set(now, "(");
            solve(now + 1, nL + 1, nR);
        }
        if (nR < nL) {
            s.set(now, ")");
            solve(now + 1, nL, nR + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        boolean first = true;
        while (sc.hasNext()) {
            N = sc.nextInt();
            s.clear();
            for (int i = 0; i < 2 * N; i++) {
                s.add(" ");
            }
            if (first) {
                first = false;
            } else {
                System.out.println();
            }
            solve(0, 0, 0);
        }
    }

}
