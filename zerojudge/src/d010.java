
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class d010 {

    public static void solve(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (sum > n) {
            System.out.println("盈數");
        } else if (sum < n) {
            System.out.println("虧數");
        } else if (sum == n) {
            System.out.println("完全數");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            solve(n);
        }

    }

}
