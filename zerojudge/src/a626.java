
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class a626 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int v = Integer.parseInt(s);
        for (int i = 2; i <= v; i++) {
            BigInteger bg = new BigInteger(Integer.toString(i));
            if (bg.isProbablePrime(1)) {
                list.add(i);
            }
        }
        int num = list.size();
        //   System.out.println("list : " + list);
        for (int i = 0; i < num; i++) {
            int n = 10 - (int) (Math.log10(list.get(i)) + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print(list.get(i));
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        while (true) {

            String s = br.readLine();
            solve(s);
        }
    }

}
