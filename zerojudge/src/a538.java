
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class a538 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        BigInteger f = new BigInteger(s);
        if(f.mod(BigInteger.valueOf(17)).equals(BigInteger.ZERO)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    public static void main(String[] args) throws IOException {
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.equals("0")){
                System.exit(0);
            }
            solve(s);
        }
    }

}
