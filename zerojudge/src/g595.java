
import java.util.Scanner;

public class g595 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n  = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            if(a[0] == 0){
                sum += a[1];
            }
            if(a[a.length-1] == 0){
                sum += a[a.length-2];
            }
            for (int i = 1; i < a.length-1; i++) {
                if(a[i] == 0){
                    sum += Math.min(a[i-1], a[i+1]);
                }
            }
            System.out.println(sum);
        }
    }
    
}
