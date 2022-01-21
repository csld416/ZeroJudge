
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d098 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        
        int sum = 0;
        String w[] = s.split("\\s+");
        for (int i = 0; i < w.length; i++) {
            boolean r = true;
            for (int j = 0; j < w[i].length(); j++) {
                if(!Character.isDigit(w[i].charAt(j))){
                    r = false;
                    break;
                }
            }
            if(r == true){
                sum += Integer.parseInt(w[i].trim());
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
       while(sc.hasNext()){
           String s = sc.nextLine();
           solve(s.trim());
       }
    }

}
