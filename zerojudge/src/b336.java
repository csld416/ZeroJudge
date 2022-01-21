
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class b336 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s");
        BigInteger a = new BigInteger(w[0]);
        BigInteger b = new BigInteger(w[1]);
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        if (b.equals(zero)) {
            System.out.println("Go Kevin!!");
        } else if (!a.equals(zero) && !b.equals(zero)) {
            System.out.println(((a.subtract(one)).mod(b)).equals(zero) ? "Go Kevin!!" : "No Stop!!");
        }else{
            
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            solve(s);
        }
    }

}
