
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class d639 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        int n = Integer.parseInt(s);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(3);a.add(5);a.add(9);
        if(n < 4){
            System.out.println(1);
        }else{
            
        }
        

    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        solve(s);
    }

}
// 1 1 1 ,,,3,5,7,15,27,49,91,
