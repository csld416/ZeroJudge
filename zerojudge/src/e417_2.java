
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e417_2 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int a[]) {
        long sum = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(i != j){
                   sum += (a[i]*a[j]);
               }
            }
        }
        System.out.println(sum/2);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(a);

        }
    }

}
