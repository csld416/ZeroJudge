
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a095 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int m, int n) {
        System.out.println(n != m ? n + 1 : n);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            solve(m, n);
        }
    }

}
