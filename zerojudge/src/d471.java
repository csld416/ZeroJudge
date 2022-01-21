
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d471 {

    public static void solve(int n) {
        
        int a[] = new int[n];
        System.out.println(Integer.toBinaryString(n));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solve(n);

    }

}
