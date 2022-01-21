
import java.math.BigInteger;
import java.util.Scanner;

public class a021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String str1, str2, op;
        BigInteger n1, n2, ans;

        while (keyboard.hasNext()) {
            str1 = keyboard.next();
            op = keyboard.next();
            str2 = keyboard.next();
            n1 = new BigInteger(str1);
            n2 = new BigInteger(str2);
            switch (op.charAt(0)) {
                case '+':
                    System.out.println(n1.add(n2));
                    break;
                case '-':
                    System.out.println(n1.subtract(n2));
                    break;
                case '*':
                    System.out.println(n1.multiply(n2));
                    break;
                case '/':
                    System.out.println(n1.divide(n2));
                    break;
                case '%':
                    System.out.println(n1.mod(n2));
            }
        }
    }
}
