
import java.util.Scanner;

public class a147 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int input = sc.nextInt();
            if(input == 0){
                System.exit(0);
            }
            String out = "";
            for (int i = 1; i < input; i++) {
                if (i % 7 == 0) {
                    continue;
                } else {
                    out += Integer.toString(i) + " ";
                }
            }
            out = out.trim();
            System.out.println(out);
        }
    }

}
