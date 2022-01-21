
import java.util.Scanner;

public class a003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String w[] = input.split(" ");
        int a[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        int s = (a[0] * 2 + a[1]) % 3;
        if(s == 0){
            System.out.println("普通");
        }else if(s == 1){
            System.out.println("吉");
        }else{
            System.out.println("大吉");
        }
    }

}
