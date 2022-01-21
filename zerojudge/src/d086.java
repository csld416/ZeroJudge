
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class d086 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        ArrayList<String> list= new ArrayList<>();
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isAlphabetic(s.charAt(i))){
                System.out.println("Fail");
                return;
            }
            w += Character.toUpperCase(s.charAt(i));
        }
        int sum = 0;
        char[] ch = w.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sum += (int)(ch[i] - 64);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                System.exit(0);
            }
            solve(s.trim());

        }
    }

}
