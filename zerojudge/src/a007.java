
import java.util.Scanner;
import java.lang.Math.*;

public class a007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num1 = sc.nextInt();
            // 預設輸入的數是質數,設定 flag = true
            boolean flag = true;
            // 判斷一個數是不是質數，只需判斷 2 到 num1 的平方根，減少迴圈次數
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                // 如果 輸入數 能被 2 ~~ 根號num1 之間的值整除，說明不是質數
                if (num1 % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("質數");
            } else {
                System.out.println("非質數");

            }
        }

    }
}
