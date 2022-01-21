
//import java.util.ArrayList;
import java.util.Scanner;

public class c461 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  ArrayList<Integer> list = new ArrayList<>();
      //  list.add(0);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean rr = false;
            if(AND(a, b) == c){
                System.out.println("AND");
                rr = true;
            }
            if(OR(a, b) == c){
                System.out.println("OR");
                rr = true;
            }
            if(XOR(a, b) == c){
                System.out.println("XOR");
                rr = true;
            }
            if(rr == false){
                System.out.println("IMPOSSIBLE");
            }
        }
    }
    public static int AND(int a, int b){
        if(a == 0){
            if(b == 0){
                return 0;
            }else{
                return 0;
            }
        }else{
            if(b == 0){
                return 0;
            }else{
                return 1;
            }
        }
    }
    public static int OR(int a, int b){
        if(a == 0){
            if(b == 0){
                return 0;
            }else{
                return 1;
            }
        }else{
            if(b == 0){
                return 1;
            }else{
                return 1;
            }
        }
    }
    public static int XOR(int a, int b){
        if(a == 0){
            if(b == 0){
                return 0;
            }else{
                return 1;
            }
        }else{
            if(b == 0){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
