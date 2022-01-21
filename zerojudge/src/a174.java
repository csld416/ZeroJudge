
import java.util.Scanner;

public class a174 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //k個操作
        int m = sc.nextInt(); //m-1個區間
        int mod = 0;
        String hash[] = new String[m];
        /*       for (int i = 0; i < hash.length; i++) {
            hash[i] = "null";
        }*/
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            if (a == 3) {
                a174.display(hash);
            } else {
                int b = sc.nextInt();
                mod = b % m;
                if (a == 1) {
                    a174.insert(b, mod, hash);
                } else if (a == 2) {
                    a174.remove(b, mod, hash);
                }
            }
        }
    }

    public static void insert(int n, int mod, String[] hash) {
        //   StringBuffer newString = new StringBuffer(hash[mod]);
        //   newString.insert(0, Integer.toString(n));
        if (hash[mod].equals(null)) {
            
        } else {
            String temp = hash[mod];
            hash[mod] = "";
            hash[mod] += temp;
            hash[mod] += (Integer.toString(n) + " -> ");
        }

        //System.out.println(n + " is inserted in hashtable");
    }

    public static void remove(int n, int mod, String[] hash) {
        hash[mod].replace((Integer.toString(n) + " ->"), "");
    }

    public static void display(String[] hash) {
        System.out.println("===== s =====");
        for (int i = 0; i < hash.length; i++) {
            if (i < 10) {
                System.out.println("[00" + i + "]:" + hash[i]);
            } else if (i >= 10 && i < 100) {
                System.out.println("[0" + i + "]:" + hash[i]);
            } else if (i >= 100) {
                System.out.println("[" + i + "]:" + hash[i]);
            }

        }
        System.out.println("===== e =====");
    }
}
