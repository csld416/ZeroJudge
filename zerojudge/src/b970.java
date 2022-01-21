
import java.util.Scanner;

public class b970 {
    static void solver(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i+". I don't say swear words!");
        }
    }

    public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
           solver(sc.nextInt());
       }
    }
    
}
