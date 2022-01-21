
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class a119 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        if(isMatched(s) == true){
            String w[] = s.split("");
            Arrays.sort(w);
            System.out.println(w.length/2);
        }else{
            System.out.println("0");
        }
    }

    public static boolean isMatched(String ex) {
        final String opening = "(";
        final String closing = ")";
        Stack<Character> buffer = new Stack<>();
        for (char c : ex.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                buffer.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty()) {
                    return false;
                }
                if (closing.indexOf(c) != opening.indexOf(buffer.pop())) {
                    return false;
                }
            }

        }
        return buffer.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
