
import java.util.Scanner;

public class a148 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String in = sc.nextLine();
            String w[] = in.split(" ");
            int average = Integer.parseInt(w[0]);
            int score[] = new int[w.length-1];
            for (int i = 1, j = 0; i < w.length; i++, j++) {
                score[j] = Integer.parseInt(w[i]);
            }
            if(ave(score, average) >= 59){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
    protected static int ave(int input[], int b){
        int out = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        out = sum /b;
        return out;
    }
}
