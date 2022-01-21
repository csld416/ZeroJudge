
import java.util.Arrays;
import java.util.Scanner;

public class a224 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            boolean out = check(del(input));
            if (out == true) {
                System.out.println("yes !");
            } else {
                System.out.println("no...");
            }
        }
    }

    public static String del(String input) {
        String pure = "";
        int count = 0;
        String w[] = input.split("");
        char temp[] = new char[w.length];
        for (int i = 0; i < w.length; i++) {
            temp[i] = input.charAt(i);
            temp[i] = Character.toUpperCase(temp[i]);
        }
        for (int i = 0; i < temp.length; i++) {
            if (Character.isLetter(temp[i])) {
                pure += temp[i];
            }
        }
        return pure;
    }

    public static int[] search(char input[]) {
        int count[] = new int[26];
        int total[] = new int[26];
        for (int i = 0; i < total.length; i++) {
            total[i] = i + 65;
        }
        for (int i = 0; i < input.length; i++) {
            int token = (int) input[i];
            count[token - 65]++;
        }
        return count;
    }

    public static boolean check(String pure) {
        boolean result = false;
        char w[] = new char[pure.length()];
        for (int i = 0; i < w.length; i++) {
            w[i] = pure.charAt(i);
        }
        int re[] = search(w);
        int count = 0;
        for (int i = 0; i < re.length; i++) {
            if(count > 1){
                return false;
            }
            if (re[i] % 2 != 0) {
                count++;
            } else {
                result = true;
            }
        }
        return result;

    }
}
