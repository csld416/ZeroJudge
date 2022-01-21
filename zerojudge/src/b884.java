
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b884 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s+");
        int a = Integer.parseInt(w[0]);
        int b = Integer.parseInt(w[1]);
        int yee = 100 - (a + b);
        if (yee > 0 && yee <= 30) {
            System.out.println("sad!");
        } else if (yee > 30 && yee <= 60) {
            System.out.println("hmm~~");
        } else if (yee > 60 && yee < 100) {
            System.out.println("Happyyummy");
        }else if(yee <= 0 || yee >= 100){
            System.out.println("evil!!");
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            solve(s);
        }

    }

}
