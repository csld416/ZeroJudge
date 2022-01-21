
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e343 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    public static void solve(int w, int h) {
        double h_ = h* 1.0/100 ;
        double a = w/Math.pow(h_, 2);
        System.out.println(Math.round(a*10.0)/10.0);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            solve(w, h);
        }
    }

}
