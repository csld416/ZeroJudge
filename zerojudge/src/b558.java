
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class b558 {

    public static void main(String[] args) {
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
           int a = sc.nextInt();
           int sum = 0;
            for (int i = 1; i < a; i++) {
                sum += i;
            }
            System.out.println(1+sum);
           
        }
    }

}
