
import java.util.Scanner;

public class g498 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean aa = false;
        for (int i = 1; i < c; i++) {
            for (int j = 1; j < c; j++) {
                if(i*a + j*b == c){
                    aa = true;
                    break;
                }
            }
        }
        if(aa ==  false){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
    
}
