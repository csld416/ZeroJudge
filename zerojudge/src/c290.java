
import java.util.Scanner;


public class c290 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String in = sc.nextLine();
            String[] w = in.split("");
            int odd_sum = 0, even_sum = 0;
            for (int i = 0; i < w.length; i++) {
                if(i%2 == 0){
                    even_sum += Integer.parseInt(w[i]);
                }else{
                    odd_sum += Integer.parseInt(w[i]);
                }
            }
            System.out.println(Math.abs(odd_sum-even_sum));
        }
    }
    
}
