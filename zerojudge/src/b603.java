
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b603 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int x1, int y1, int x2, int y2) {
        int k = (y2-y1)/(int)(Math.pow(x2-x1, 2));
        
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            solve(x1, y1, x2, y2);
        }
    }

}
