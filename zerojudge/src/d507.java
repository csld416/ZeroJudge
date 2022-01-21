
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class d507 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a[] = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            Arrays.sort(a);
            int a2 = (int)Math.pow(a[0], 2);
            int b2 = (int)Math.pow(a[1], 2);
            int c2 = (int)Math.pow(a[2], 2);
            if(c2 == a2 + b2){
                System.out.println("right triangle");
            }else if(c2 < a2 + b2){
                System.out.println("acute triangle");
            }else if(c2 > a2 + b2){
                System.out.println("obtuse triangle");
            }
        }
    }
    
}
