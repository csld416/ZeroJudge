
import java.util.Arrays;
import java.util.Scanner;

public class c381 {

    static void solve(int[] arr, StringBuilder s) {
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
           ss.append(s.charAt(arr[i]));
        }
        System.out.println(ss);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            String s = sc.nextLine();
            StringBuilder st = new StringBuilder();
            for (int i = 0; i < n1; i++) {
                st.append(sc.nextLine());
            }
            int a[] = new int[n2];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt()-1;
            }
            solve(a, st);
        }
    }

}
