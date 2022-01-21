
import java.util.Scanner;

public class a453 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (n-- > 0) {
                int[] a = new int[3];
                a[0] = sc.nextInt();
                a[1] = sc.nextInt();
                a[2] = sc.nextInt();
                int d = (int)Math.pow(a[1], 2) - 4*a[0]*a[2];
                if(d > 0 || d == 0){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }

}
