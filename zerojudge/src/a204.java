
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class a204 {
    
    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void solve(String s) {
        BigDecimal x = new BigDecimal(s);
        ArrayList<BigDecimal> fac = new ArrayList<>();
        BigDecimal tt = new BigDecimal("1.0");
        fac.add(tt);
        for (int i = 2; i < 225; i++) {
            tt = tt.multiply(BigDecimal.valueOf(i));
            fac.add(tt);
        }
        BigDecimal sin = new BigDecimal("0");
        sin = x;
        for (int i = 5; i < 225; i+=4) {
            sin = sin.add((x.pow(i).divide(fac.get(i-1))));
        }
        for (int i = 3; i < 225; i+=4) {
            sin = sin.subtract((x.pow(i).divide(fac.get(i-1))));
        }
         
        System.out.println(sin.precision());
        
    }
    
    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            String n = sc.nextLine();
            solve(n);
        }
    }
    
}
