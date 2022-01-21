
import java.util.Scanner;

public class a135 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 1;
        while (sc.hasNext()) {

            String in = sc.nextLine();
            if (in.equals("#")) {
                System.exit(0);
            } else {
                String s = "";
                if (in.equals("HELLO")) {
                    s = "ENGLISH";
                } else if (in.equals("HOLA")) {
                    s = "SPANISH";
                } else if (in.equals("HALLO")) {
                    s = "GERMAN";
                } else if (in.equals("BONJOUR")) {
                    s = "FRENCH";
                } else if (in.equals("CIAO")) {
                    s = "ITALIAN";
                } else if (in.equals("ZDRAVSTVUJTE")) {
                    s = "RUSSIAN";
                } else {
                    s = "UNKNOWN";
                }
                System.out.println("Case " + d + ": " + s);
                d++;
            }
        }
    }

}

