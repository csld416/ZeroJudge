
import java.util.Scanner;

public class e051 {

    protected static void solve(StringBuilder w) {
        for (int i = 1; i < w.length()-1; i++) {
           w.setCharAt(i,'_');
        }
        System.out.println(w);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuilder w = new StringBuilder();
            w.append(sc.nextLine());
            solve(w);
        }
    }

}
