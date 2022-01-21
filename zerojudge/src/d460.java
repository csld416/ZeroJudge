
import java.util.Scanner;

public class d460 {

    static int solve(int a) {
        int b = 0;
        if (a >= 0 && a <= 5) {
            return 0;
        } else if (a >= 6 && a <= 11) {
            return 590;
        }else if (a >= 12 && a <= 17) {
            return 790;
        }else if (a >= 18 && a <= 59) {
            return 890;
        }else if (a >= 60) {
            return 399;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(solve(sc.nextInt()));
        }
    }

}
