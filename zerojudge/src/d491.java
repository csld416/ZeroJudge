
import java.util.Scanner;

public class d491 {

    protected static void solve(int n, int m){
        if(n > m){
            n ^= m;
            m ^= n;
            n ^= m;
        }
        long sum = 0;
        for (int i = n; i <= m; i++) {
           if( i%2 == 0){
               sum += i;
           }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            solve(n,m);
        }
    }
    
}
