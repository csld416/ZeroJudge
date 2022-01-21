
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class e447 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String w[] = br.readLine().split("\\s+");
            int k = Integer.parseInt(w[0]);
            if (k == 1) {
                q.add(Integer.parseInt(w[1]));
            } else if (k == 2) {
                if (q.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(q.peek());
                }
            } else if (k == 3) {
                if (!q.isEmpty()) {
                    q.remove();
                }
            }
        }
    }

}
