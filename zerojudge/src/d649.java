
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d649 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if(n == 0){
                System.exit(0);
            }
            solve(n);
            System.out.println();
        }

    }

}
