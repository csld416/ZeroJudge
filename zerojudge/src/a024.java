
import java.util.Scanner;

public class a024 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String w[] = input.split(" ");
        int a[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        System.out.println(gcd(a[0], a[1]));
        
    }
    
    static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
