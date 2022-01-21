
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c659 {

    public static void solve(String str) {
        String w[] = str.split("\\s+");
        for (int i = 1; i < w.length; i++) {
            System.out.print(w[i] + " ");
            if(i <= w.length-2){
                System.out.print(w[0] + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        solve(input);
    }

}
