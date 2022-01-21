
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d559 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n) {
        System.out.println("'C' can use printf(\"%d\",n); to show integer like " + n);
    }

    public static void main(String[] args) throws IOException {
        while(sc.hasNext()){
            int n = sc.nextInt();
            solve(n);
        }
    }

}
