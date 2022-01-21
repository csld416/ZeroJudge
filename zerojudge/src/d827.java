
import java.io.IOException;
import java.util.Scanner;

public class d827 {

    static int solve(int a){
        int d = a/12*50;
        int b = a%12*5;
        return d+b;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(solve(sc.nextInt()));
        }
    }
    
}
