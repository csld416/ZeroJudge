
import java.util.Arrays;
import java.util.Scanner;

public class d065 {


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a[] = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[2]);
        }
    }
    
}
