
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class d051 {

    static BigDecimal temp(double a){
        String b = Double.toString((a-32)*5/9);
        BigDecimal l = new BigDecimal(b);
        return l.setScale(3);
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double n = sc.nextDouble();
            System.out.printf("%.3f\n",(n-32)*5/9);
        }
    }
    
}
