
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a148_ {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve() {
       int n = sc.nextInt();
       int a[] = new int[n];
       int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        double av = sum/(n*1.0);
        System.out.println(av > 59 ? "no" : "yes");

    }
   
    public static void main(String[] args) throws IOException {
        while(sc.hasNext()){
            solve();
        }
    }

}
