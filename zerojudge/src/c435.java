
import java.util.Arrays;
import java.util.Scanner;


public class c435 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[a.length-1] - a[0]);
        }
    }
    
}
