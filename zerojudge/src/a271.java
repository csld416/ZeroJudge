
import java.util.Arrays;
import java.util.Scanner;

public class a271 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            //  String _0 = sc.nextLine();
            int a[] = new int[6];
            for (int i = 0; i < n * 2; i++) {
                //=======================================parameter
                //String input = sc.nextLine();
                // String r[] = input.trim().split(" ");
                for (int j = 0; j < 6; j++) {
                    a[j] = sc.nextInt();
                }
                System.out.println();
                int weight = a[5];
                //======================================day
                String null_ = sc.nextLine();
                String line = sc.nextLine();
                String[] w = line.split(" ");
                int[] day = new int[w.length];
                for (int j = 0; j < w.length; j++) {
                    day[j] = Integer.parseInt(w[j]);
                }
                //======================================
                boolean poison = false;
                boolean life = true;
                int x = 0;
              //  System.out.println("line = " + line);
              //  System.out.println(Arrays.toString(a));
              //  System.out.println(Arrays.toString(day));
                if (line.isEmpty()) {
                    System.out.println(weight);
                } else {
                    for (int j = 0; j < day.length; j++) {
                        if (weight <= 0) {
                            life = false;
                            break ;
                        } else {
                            if (poison == true) {
                                x++;
                            }
                            weight -= a[4] * x;
                            if (day[j] == 1) {
                                weight += a[0];
                            } else if (day[j] == 2) {
                                weight += a[1];
                            } else if (day[j] == 3) {
                                weight -= a[2];
                            } else if (day[j] == 4) {
                                weight -= a[3];
                                poison = true;
                            }else{
                                weight += 0;
                            }
                        }
                    }
                    if(life == true){
                        System.out.println(weight + "g");
                    }else{
                        System.out.println("bye~Rabbit");
                    }
                    
                }

            }
        }
    }

}
