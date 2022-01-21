
import java.util.Scanner;

public class a263 {

    static int[] monthday = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] year = new int[2];
            int[] month = new int[2];
            int[] day = new int[2];
            int check;
            year[0] = sc.nextInt();
            month[0] = sc.nextInt();
            day[0] = sc.nextInt();
            year[1] = sc.nextInt();
            month[1] = sc.nextInt();
            day[1] = sc.nextInt();
            check = calculateDay(year[0], month[0], day[0]) - calculateDay(year[1], month[1], day[1]);
            System.out.println(check > -1 ? check : -check);
        }
    }

    public static int calculateDay(int year, int month, int day) {
        int leaps, isleap;
        boolean boolisleap;
        boolisleap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        isleap = boolisleap == true ? 1 : 0;
        year--;
        leaps = year / 4 - year / 100 + year / 400;
        return (year * 365 + leaps) + (monthday[month] + ((month > 2) ? isleap : 0)) + day;
    }
}
