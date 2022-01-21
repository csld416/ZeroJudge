
import java.util.Scanner;

public class c726 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String w[] = s.split("\\s");
            System.out.println(w[0] + " and " + w[1] + " sitting in the tree");
        }
    }

}
