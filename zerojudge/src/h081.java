
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class h081 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int a[], int d) {
        Stack<Integer> e = new Stack<>();
        
        int me = a[0]; e.push(me);
        int possess = 1;
        int profit = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] - e.peek() >= d && possess == 1){
              possess = 0;  
              e.push(a[i]);
              
              profit += (a[i] - me);
            }
            
            if(a[i] - e.peek() <= -d && possess == 0){
                e.push(a[i]);
                possess = 1;
                me = a[i];
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solve(a, d);
    }

}
