
import java.util.Scanner;

public class g496 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b%a == 0){
              System.out.println((int)Math.ceil(b/a));
            }else{
                System.out.println((int)Math.ceil(b/a)+1);
            }
        }
    }
}
