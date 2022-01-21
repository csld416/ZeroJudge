
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a693 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {

    }

    public static void main(String[] args) throws IOException {
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int e[] = new int[m];
            for (int i = 0; i < e.length; i++) {
                e[i] = sc.nextInt();
            }
            while(n-- > 0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = 0;
                for (int i = a-1; i <= b-1; i++) {
                    sum += e[i];
                }
                System.out.println(sum);
            }
        }
    }

}
