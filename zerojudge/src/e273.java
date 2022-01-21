
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class e273 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int a[]) {
        int b[] = new int[a.length];
        for (int i = b.length-1, g = 0; i > -1; i--, g++) {
            b[i] = g;
        }
        int c[] = new int[a.length];
        for (int i = 0; i <a.length; i++) {
            c[i] = a[i]*b[i];
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i] != 0){
                System.out.print(c[i] + " ");
            }
            
        }
    }

    public static void main(String[] args) throws IOException {
        while(sc.hasNext()){
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solve(a);
        }
    }

}
