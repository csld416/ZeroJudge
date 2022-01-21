
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b923 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String w[] = br.readLine().split("\\s+");
            int k = Integer.parseInt(w[0]);
            if(k == 1){
                st.pop();
            }else if(k == 2){
                System.out.println(st.peek());
            }else if( k == 3){
                st.push(Integer.parseInt(w[1]));
            }
        }
    }

}
