
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class f925 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {

    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String w[] = s.split("\\s");
        if(w[0].equals("6") && w[1].equals("12")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    
    }

}
