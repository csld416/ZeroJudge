
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class c294 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a[] = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            Arrays.sort(a);
            int a2 = (int) Math.pow(a[0], 2);
            int b2 = (int) Math.pow(a[1], 2);
            int c2 = (int) Math.pow(a[2], 2);
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            if (fo(a) == true) {
                if (c2 == a2 + b2) {
                    System.out.println("Right");
                } else if (c2 < a2 + b2) {
                    System.out.println("Acute");
                } else if (c2 > a2 + b2) {
                    System.out.println("Obtuse");
                }
            }else{
                System.out.println("No");
            }

        }
    }

    public static boolean fo(int[] arr) {
        if(arr[0] + arr[1] <= arr[2]){
            return false;
        }else{
            return true;
        }
    }

}
