
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class b578 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s+");
        BigInteger a[] = new BigInteger[w.length];
        Arrays.sort(a);
        BigInteger A = a[0].pow(2);
        BigInteger B = a[1].pow(2);
        BigInteger C = a[2].pow(2);
        if (C.compareTo(A.add(B)) == 1) {
            System.out.println("obtuse triangle");
        } else if (C.compareTo(A.add(B)) == 0) {
            System.out.println("right triangle");
        } else if (C.compareTo(A.add(B)) == -1) {
            System.out.println("acute triangle");
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < 2; i++) {
            String s = br.readLine();
            solve(s);
        }

    }

}
