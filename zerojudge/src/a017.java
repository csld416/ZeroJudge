
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a017 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /*
     2 + 3 * 4
     2 * ( 3 + 4 ) * 5
    */
    public static void solve(String s) {
       ArrayList<Integer> list = new ArrayList<>();
       String w[] = s.split("\\s+");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                list.add(Integer.parseInt(Character.toString(s.charAt(i))));
            }
        }
        System.out.println(list);

    }

    public static void main(String[] args) throws IOException {
        while(sc.hasNext()){
            String s = sc.nextLine();
            solve(s);
        }
    }

}
