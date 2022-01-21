package SCIST;

import java.util.Arrays;
import java.util.Scanner;

public class AverageParodox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (n-- > 0) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                double[] cs = new double[n1];
                double[] eco = new double[n2];
                double cs_sum = 0, eco_sum = 0;
                double cs_av, eco_av;
                for (int i = 0; i < cs.length; i++) {
                    cs[i] = sc.nextInt();
                    cs_sum += cs[i];
                }
                for (int i = 0; i < eco.length; i++) {
                    eco[i] = sc.nextInt();
                    eco_sum += eco[i];
                }
                cs_av = (cs_sum / cs.length) /1.0;
                eco_av = (eco_sum / eco.length)/1.0;
                Arrays.sort(cs);
                int sum = 0;
                double new_csav;
                double new_ecoav;
                for (int i = 0; i < cs.length; i++) {
                    new_csav = ((cs_sum - cs[i]) / (cs.length - 1))/1.0;
                    new_ecoav = ((eco_sum + cs[i])*1.0 / (eco.length + 1)*1.0)/1.0;
                    if (new_csav > cs_av && new_ecoav > eco_av) {
                        sum++;
                    }
/*
                    System.out.println("ecosum: " + eco_sum);
                    System.out.println("old cs:" + cs_av);
                    System.out.println("old ecoav:" + eco_av);
                    System.out.println("new newcs:" + new_csav);
                    System.out.println("new ecoav:" + new_ecoav);
*/
                }

                System.out.println(sum);

            }
        }
    }

}
