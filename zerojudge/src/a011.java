
    import java.util.Scanner;

    public class a011 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                boolean start = false;
                int count = 0;
                char[] words = sc.nextLine().toCharArray();
                for (char st : words) {
                    if (Character.isLetter(st)) {
                        if (!start) {
                            count++;
                            start = true;
                        }
                    } else {
                        start = false;
                    }
                }   
                System.out.println(count);
            }
        }

    }
