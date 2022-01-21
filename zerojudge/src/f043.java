
import java.util.Arrays;
import java.util.Scanner;

public class f043 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int R = sc.nextInt(); // answer
            int A = sc.nextInt(); // one of the elements
            if(R == A){
                System.out.println(ans(A-3, R));
            }else{
                System.out.println(ans(A, R));
            }
        }
    }
      //                        1           3
    public static String ans(int oper, int ans){
        int mid = ans-oper;
        int[] yy = {oper, mid, ans};
        Arrays.sort(yy);
        String[] xx = {"", "", ""};
        for (int i = 0; i < xx.length; i++) {
            xx[i] = Integer.toString(yy[i]);
        }
        return (xx[0]+"+"+xx[1]+"="+xx[2]);
    }
}
