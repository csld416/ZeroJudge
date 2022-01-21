
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c014 {

    protected static void solve(int a, int b) {
        int sum = 0;
        if (a % 10 + b % 10 >= 10) {
            sum++;
            if (a % 100 / 10 + b % 100 / 10 + 1 >= 10) {
                sum++;
                if (a / 100 + b / 100 + 1 >= 10) {
                    sum++;
                }else{
                    
                }
            } else {
                if (a / 100 + b / 100 >= 10) {
                    sum++;
                }else{
                    
                }
            }
        } else {
            if (a % 100 / 10 + b % 100 / 10 >= 10) {
                sum++;
                if (a / 100 + b / 100 + 1 >= 10) {
                    sum++;
                } else {

                }
            } else {
                if (a / 100 + b / 100 >= 10) {
                    sum++;
                } else {

                }
            }
        }
        if(sum == 1){
            System.out.println("1 carry operation.");
        }else if(sum == 0){
            System.out.println("No carry operation.");
        }else{
            System.out.println(sum + " carry operations.");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String w[] = in.split("\\s+");
        if (w[0].equals("0") && w[1].equals("0")) {
            System.exit(0);
        }
        int a = Integer.parseInt(w[0]);
        int b = Integer.parseInt(w[1]);
        solve(a, b);
    }

}
