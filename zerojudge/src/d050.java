
import java.util.Scanner;


public class d050 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println((sc.nextInt()-15+24)%24);
        }
    }
    
}
