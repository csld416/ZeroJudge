
import java.math.BigInteger;
import java.util.Scanner;

public class d124 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String next = sc.nextLine();
            BigInteger a = new BigInteger(next);
            BigInteger b = new BigInteger("3");
            BigInteger c = new BigInteger("0");
            a = a.abs();
            if(a.mod(b).equals(c)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
    
}
