
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class f035 {

    public static void solve(String n) {
        char w[] = n.toCharArray();
        int ans[] = new int[w.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (int) w[i];
        }
        String out = "";
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i <= ans.length - 2) {
                System.out.print("_");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solve(input);
    }

}
