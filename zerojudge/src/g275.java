
import java.util.Arrays;
import java.util.Scanner;

public class g275 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (n-- > 0) {
                int[][] a = new int[2][7];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 7; j++) {
                        a[i][j] = sc.nextInt();
                    }
                }
                String x = "";
                if (a[0][1] != a[0][5] || a[0][1] == a[0][3] || a[1][1] != a[1][5] || a[1][1] == a[1][3]) {
                    x += "A";
                }
                if (a[0][6] != 1 || a[1][6] != 0) {
                    x += "B";
                }
                if (a[0][1] == a[1][1] || a[0][3] == a[1][3] || a[0][5] == a[1][5]) {
                    x += "C";
                }
                if (x.equals("")) {
                    System.out.println("None");
                } else {
                    System.out.println(x);
                }
            }

        }

    }

}
