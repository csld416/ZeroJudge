
import java.util.Scanner;

public class c002 {

    protected static int f(int n){
        if(n <= 100){
            return 91;
        }else{
            return n-10;
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                System.exit(0);
            }
            System.out.println("f91("+n+") = "+f(n));
        }
    }
    
}
