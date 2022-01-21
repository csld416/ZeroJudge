
import java.util.Scanner;

public class a248 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
            int temp;
            System.out.print(a/b+".");
            for (int i = 0; i < N; i++) {
               temp = a%b;
                System.out.print(temp*10/b);
                a = temp*10;
            }
            System.out.println();
        }
    }
    
}
