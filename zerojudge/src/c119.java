
import java.math.BigInteger;
import java.util.Scanner;

public class c119 {
    protected static BigInteger fab(int n){
        BigInteger sum = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            BigInteger j = new BigInteger(Integer.toString(i));
            sum = sum.multiply(j);
        }
        return sum;
    }
    protected static int solver(BigInteger n){
        String s = n.toString();
        String w[] = s.split("");
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += Integer.parseInt(w[i]);
        }
        return sum;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(solver(fab(n)));
        }
        
    }
    
}
