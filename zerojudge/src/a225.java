
import java.util.Scanner;

public class a225 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] m = new int[n];
            int temp;

            for (int i = 0; i < n; i++) {
                m[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (m[i] % 10 < m[j] % 10) {
                        temp = m[i];
                        m[i] = m[j];
                        m[j] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (m[i] % 10 == m[j] % 10) {
                        if (m[i] > m[j]) {
                            temp = m[i];
                            m[i] = m[j];
                            m[j] = temp;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(m[i] + " ");
            }
            System.out.println();
        }
    }

}
