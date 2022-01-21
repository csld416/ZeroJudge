
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e456 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s");
        String y = "";
        for (int i = 0; i < w.length; i++) {
            y += w[i] + " " + "little";
            if(i != w.length-1){
                y += ",";
            }
            y += " ";
        }
        y += "Indians";
        System.out.println(y);
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
