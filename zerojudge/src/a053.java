
import java.util.Scanner;

public class a053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int score = 0;
            if(n >= 40){
                score = 100;
            }else if(n >= 21){
                score = 80 + n-20;
            }else if(n >= 11){
                score = 60 + 2*(n-10); 
            }else if(n >= 0){
                score = 6*n;
            }else{
                
            }
            System.out.println(score);
            
            
        }
    }
    
}
