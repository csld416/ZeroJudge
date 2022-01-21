
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class d212 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n) {
        ArrayList<BigInteger> list = new ArrayList<>();
        BigInteger one  = new BigInteger("1");
        list.add(one);
        list.add(one);
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i-1).add(list.get(i-2)));
        }
        System.out.println(list.get(n));
    }

    public static void main(String[] args) throws IOException {
        while(sc.hasNext()){
            int n = sc.nextInt();
            solve(n);
        }
    }

}
