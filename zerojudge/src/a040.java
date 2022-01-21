
import java.util.Scanner;

public class a040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String temp[] = input.split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        boolean xx = false, jug = false;
        for (int i = a; i <= b; i++) {
            String tem = Integer.toString(i);
            xx = check(tem);
            if(xx == true){
                jug = true;
                System.out.print(tem + " ");
            }
        }
        if(jug == false){
            System.out.println("none");
        }
    }
    static boolean check(String a){
        boolean out = false;
        int input = Integer.parseInt(a);
        int len = a.length();
        String w[] = a.split("");
        int x[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            x[i] = Integer.parseInt(w[i]);
        }
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)Math.pow(x[i], len);
            sum += x[i];
        }
        if(sum == input){
            out = true;
        }
        return out;
    }
}
