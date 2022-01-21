
import java.util.Scanner;

public class c382 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String in = sc.nextLine();
            String[] w = in.split("\\s+");
            int a = Integer.parseInt(w[0]);
            int b = Integer.parseInt(w[2]);
            switch (w[1]) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
            }
        }
    }

}
