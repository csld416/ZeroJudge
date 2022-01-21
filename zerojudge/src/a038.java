
import java.util.Scanner;

public class a038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String w[] = input.split("");
        String b = "";
        if(w.length == 1){
            b = input;
        }else if (w[w.length - 1].equals("0")) {
            for (int i = w.length - 2; i > -1; i--) {
                b += w[i];
            }
        } else {
            for (int i = w.length - 1; i > -1; i--) {
                b += w[i];
            }
        }
        int out = 0;
        out = Integer.parseInt(b);
        System.out.println(out);
    }

}
