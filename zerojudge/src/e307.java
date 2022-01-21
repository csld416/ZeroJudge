
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e307 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String s1 = s;
        String pri = "";
        
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isSpaceChar(s.charAt(i))){
                pri += s.charAt(i);
            }
        }
         for (int i = 0; i < s.length(); i++) {
            if(!Character.isSpaceChar(s.charAt(i))){
                s = s.replace(Character.toString(s.charAt(i)), "Q");
            }
        }
        char ch[] = pri.toCharArray();
        String w[] = s.split("Q");
        int e[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            if(!w[i].isEmpty()){
                int g = 0;
                for (int j = 0; j < w[i].length(); j++) {
                    g++;
                }
                if(g %2 == 0){
                    e[i] = 0;
                }else{
                    e[i] = 1;
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            
            if(e[i] == 1){
                System.out.print(" ");
            }
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
