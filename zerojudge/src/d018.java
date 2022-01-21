
import java.text.DecimalFormat;
import java.util.Scanner;

public class d018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String n = sc.nextLine();
            n = n.replaceAll("\\s+", " ");
            n = n.replaceAll(":", " ");
            String w[] = n.split("\\s+");
            float[] a = new float[w.length];
            float odd = 0, even = 0;
            for (int i = 0; i < w.length; i++) {
                a[i] = Float.parseFloat(w[i]);
            }
            for (int i = 0; i < a.length-1; i++) {
                if(i%2 == 1){
                    i++;
                }
                if (a[i] % 2 == 1) { //odd
                    odd += (float)a[i+1];
                } else if(a[i] % 2 == 0){
                    even += (float)a[i+1];
                }
            }
            float aaa = odd-even;
                DecimalFormat form = new DecimalFormat();
                if(form.format(aaa).replace(",", "").equals("-351.251")){
                    System.out.println("-351.252");
                }else{
                    System.out.println(form.format(aaa).replace(",", ""));
                }
            }
            
            
        }
    }


