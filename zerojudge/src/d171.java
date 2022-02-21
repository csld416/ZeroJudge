
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class d171 {

    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static PrintWriter out = new PrintWriter(System.out);
    static int a, b;
    public static void solve() {
    	int ans = (int)(b * Math.log10(a))+1;
    	out.append(ans  + "\n");
    	out.flush();
    }

    public static void main(String[] args) throws IOException {
        while(sc.hasNext()) {
        	a = sc.nextInt();
        	b = sc.nextInt();
        	solve();
        }
    }

}
