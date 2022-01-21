
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b762 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(int n) throws IOException {
        int kill = 0, token = 0, total = 0, die = 0, ass = 0;
        while (n-- > 0) {
            String s = br.readLine().trim();
            if (s.contains("K")) {
                kill++;
                total++;
                if (kill < 3) {
                    System.out.println("You have slain an enemie.");
                } else if (kill == 3) {
                    System.out.println("KILLING SPREE!");
                } else if (kill == 4) {
                    System.out.println("RAMPAGE~");
                } else if (kill == 5) {
                    System.out.println("UNSTOPPABLE!");
                } else if (kill == 6) {
                    System.out.println("DOMINATING!");
                } else if (kill == 7) {
                    System.out.println("GUALIKE!");
                } else if (kill == 8) {
                    System.out.println("LEGENDARY!");
                }
            } else if (s.contains("D")) {
                die++;
                if (kill < 3) {
                    System.out.println("You have been slained.");
                } else if (kill >= 3) {
                    System.out.println("SHUTDOWN.");
                    
                }
                kill = 0;
            } else if (s.equals("Get_Assist")) {
                token = 3;
                ass += 1;
            }
        }
        System.out.println(total + "/" + die + "/" + (ass));
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        solve(n);

    }

}
