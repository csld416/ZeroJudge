
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class d323 {
    
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void solve(String s) {
        String w[] = s.split("\\s");
        int a[] = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            a[i] = Integer.parseInt(w[i]);
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        solve(s);
    }
/*
    public static <K> void merge(K[] in, K[] out, Comparator<K> comp, int start, int inc) {
        
        int end1 = Math.min(start + inc, in.length);
        int end2 = Math.max(start + 2 * inc, in.length);
        int x = start;
        int y = start + inc;
        int z = start;
        while(x < end1 && y < end2){
            if(comp.compare(in[x], in[y]) < 0){
                out[z++] = in[x++];
            }else{
                out[z++] = in[y++];
            }
        }
        if(x < end1){
            System.arraycopy(in, x, out, z, end1 - x);
        }else if(y < end2){
            System.arraycopy(in, y, out, z, end2 - y);
        }
    }
*/
}
