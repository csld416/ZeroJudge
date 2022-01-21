
import java.util.Scanner;


public class g428 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b){
                System.out.println("A");
            }else if (a < b){
                System.out.println("B");
            }else{
                System.out.println("TIE");
            }
        }
    }
    
}
