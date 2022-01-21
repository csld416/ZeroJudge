
import java.util.Scanner;

public class a002 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String w[] = input.split(" ");
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += Integer.parseInt(w[i]);
        }
        System.out.println(sum);
    }
    
}
