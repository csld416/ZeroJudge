
import java.util.Arrays;
import java.util.Scanner;

public class a065 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
        /*    String w[] = input.split("(?!^)");
            for (int i = 0; i < w.length; i++) {
                System.out.println(w[i] + " ");
            }*/

            char b[] = new char[7];
            int a[] = new int[7];
            for (int i = 0; i < 7; i++) {
                b[i] = input.charAt(i);
                a[i] = (int) b[i];
            }
            int out[] = new int[a.length - 1];
            for (int i = 0; i < out.length; i++) {
                out[i] = b[i + 1] - b[i];
                if(out[i] < 0){
                    out[i] *= -1;
                }
            }
            String w = "";
            for (int i = 0; i < out.length; i++) {
                w += Integer.toString(out[i]);
            }
            System.out.println(w);
        }
    }

}
