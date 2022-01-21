
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b877 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            String w[] = s.split("\\s+");
            int a[] = new int[w.length];
            for (int i = 0; i < w.length; i++) {
                a[i] = Integer.parseInt(w[i]);
            }
            Arrays.sort(a);
            int o = a[1] - a[0];
            if (o > 50) {
                o = 100 - o;
            }
            System.out.println(o);
        }

    }

}
/*
0 99 -> 99  0
99-0=99
99>50
100-99=1
 
99 -> 0 :1
99 - 0 = 99



 */
