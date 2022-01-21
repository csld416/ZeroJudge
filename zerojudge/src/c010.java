
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class c010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (sc.hasNext()) {
            list.add(sc.nextInt());
            Collections.sort(list);
            int i = list.size();
            if(list.size()%2 ==0){
                System.out.println((list.get(i/2-1) + list.get(i/2))/2);
            }else{
                System.out.println(list.get(i/2));
            }
        }

    }

}
