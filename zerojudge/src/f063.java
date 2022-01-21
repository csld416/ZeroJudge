
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class f063 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> list = new ArrayList<>();

    public static void solve() {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        list.add(a[0]);
    }

    public static void main(String[] args) throws IOException {
        int n = sc.nextInt();
        int p = n;
        while (n-- > 0) {
            solve();
        }
        Collections.sort(list);
        System.out.println(list.get(p-1));

    }

}
