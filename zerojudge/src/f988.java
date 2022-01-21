
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class f988 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(long a, long b) {
        //C a catch b (mod 10^8+7)
        if(a-b < b){
            b = a-b;
        }
        long sum1 = a;
        for (int i = 0; i < b-1; i++) {
            sum1 *= (a-1);
        }
        long sum2 = 1;
        for (int i = 1; i <= b; i++) {
        sum2 *= i;
        }
        System.out.println((sum1/sum2)%100000007);
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            String w[] = s.split("\\s");
            long a = Long.parseLong(w[0]);
            long b = Long.parseLong(w[1]);
            solve(a, b);
        }
    }

}
