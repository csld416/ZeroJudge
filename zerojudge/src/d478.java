
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d478 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int a[], int b[]) {
        int same = 0;
        int ma[] = new int[10000];
        int mb[] = new int[10000];
        for (int i = 0; i < a.length; i++) {
            ma[a[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            mb[b[i]]++;
        }
        for (int i = 0; i < 10000; i++) {
            if(ma[i] == 1 && mb[i] == 1){
                same++;
            }
        }
        System.out.println(same);
    }

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();
        while(n-- > 0){
            int a[] = new int[m];
            int b[] = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            solve(a, b);
        }
    }

}
