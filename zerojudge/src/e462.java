
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class e462 {

    public static void solve(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = 1, i = 1;
        do{
            list.add(i);
            i+=4;
        }while(a++ != 100);
        System.out.println(list.size());
         
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            solve(n);
        }

    }

}
