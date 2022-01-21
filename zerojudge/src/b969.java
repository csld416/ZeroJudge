
import java.util.Scanner;

public class b969 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] w = s.split("\\s+");
            String hello = sc.nextLine();
            for (int i = 0; i < w.length; i++) {
                System.out.print(hello+", "+w[i]);
                System.out.println("");
            }
        }
        
    }
    
}
