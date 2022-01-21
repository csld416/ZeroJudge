
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class d539 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a =  new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int token = sc.nextInt();
            for (int i = 0; i < token; i++) {
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                if(a1 > b1){
                    int tmp;
                    tmp = b1;
                    b1 = a1;
                    a1 = tmp;
                }
                System.out.println(find(a1-1, b1-1, a));
            }
        }
    }
    public static int find(int a, int b, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        for (int i = a; i < b+1; i++) {
            System.out.println("");
            list.add(arr[i]);
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    
}
