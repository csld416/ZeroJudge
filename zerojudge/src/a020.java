
import java.util.Scanner;

public class a020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String w[] = input.split("");
        //====================================
        String a[] = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "W", "Z", "I", "O"};
        byte b[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
        //check first eng letter
        int value = 0;
        for (int i = 0; i < a.length; i++) {
            if (w[0].equals(a[i])) {
                value = b[i];
                break;
            }
        }
        //value = 10a + b
        int end = 9*(value % 10);
        int sta = value / 10;
        //=================
        int num[] = new int[w.length - 1];
        for (int i = 1; i < w.length; i++) {
            num[i - 1] = Integer.parseInt(w[i]);
        }
        for (int i = 0, j = 8; i < num.length-1; i++, j--) {
            num[i] *= j;
        }
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        total += sta + end;
        //===================
        if (total % 10 == 0) {
            System.out.println("real");
        } else {
            System.out.println("fake");
        }

    }

}
