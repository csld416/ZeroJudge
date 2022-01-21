
import java.util.ArrayList;
import java.util.Scanner;

public class b971 {

    static int solve(int a1, int an, int d) {
        return (an - a1) / d + 1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            int a1 = sc.nextInt();
            int an = sc.nextInt();
            int d = sc.nextInt();
            int n = 1;
            while(n <= solve(a1, an, d)){
                list.add(a1);
                a1 += d;
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

}
