
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class b374 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solve(String s) {
        String w[] = s.split("\\s+");
        int a[] = new int[w.length];
        int num[] = new int[30001];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        Arrays.sort(a);
        for (int i = 0; i < num.length; i++) {
            num[i] = 0;
        }
        for (int i = 0; i < a.length; i++) {
            num[a[i]]++;
        }
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i] == max){
                System.out.println(i + " " + max);
            }
        }
        
        
        

    }

    public static void main(String[] args) throws IOException {
        String e = br.readLine();
        String s = br.readLine();
        solve(s);
    }

}
