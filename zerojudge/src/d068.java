
import java.util.Scanner;

public class d068 {

//m args the command line arguments
  //   */
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            System.out.println(a>50 ? a-1 : a);
        }
    }
    
}
