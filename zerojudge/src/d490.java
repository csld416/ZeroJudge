
import java.util.Scanner;

public class d490 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long sum = 0;
            for (int i = n; i <= m; i++) {
                if(i % 2 == 0){
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
    
}
