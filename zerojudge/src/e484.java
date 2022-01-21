
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class e484 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        BigInteger bg = new BigInteger(s);
        if(bg.isProbablePrime(1)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
