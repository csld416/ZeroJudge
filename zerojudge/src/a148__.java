
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a148__ {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s");
        ArrayList<Integer> ascii = new ArrayList<>();

        for (int i = 0; i < w.length; i++) {
            int n = (int) w[i].charAt(0);
            ascii.add(n);
        }
        int t[] = new int[200];
        for (int i = 0; i < ascii.size(); i++) {
            t[ascii.get(i)]++;
        }

    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
