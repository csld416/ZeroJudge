
import java.util.Scanner;

public class a022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String w1[] = input.split("");
        if (input.length() % 2 == 0) {
            System.out.println(out(check(w1)));
        } else {
            System.out.println(out(check(w1)));
        }
    }

    public static boolean check(String arr[]) {
        boolean a = true;
        A:
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length / 2) {
                break;
            }
            if (!arr[0].equals(arr[arr.length - 1])) {
                a = false;
                break;
            }
            if (!arr[i].equals(arr[arr.length - 1 - i])) {
                a = false;
            }
        }
        return a;
    }
    public static String out(boolean y){
        String x = null;
        if(y==true){
            x = "yes";
        }else{
            x = "no";
        }
        return x;
    }
}
