
import java.io.IOException;
import java.util.Scanner;

public class d058 {


    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0){
                System.out.println("0");
            }else{
                System.out.println(n>0 ? 1 : -1);
            }
        }
    }
    
}
