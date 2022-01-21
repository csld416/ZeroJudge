
import java.util.Scanner;

public class a518 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == -1 && b == -1) {
                System.exit(0);
            }
            if (a < b) { // make sure a < b
                a ^= b;
                b ^= a;
                a ^= b;
                if (a - b > 50) {
                    System.out.println((100 - a));
                } else {
                    System.out.println(a - b);;
                }

            } else if (a == b) {
                System.out.println("0");
            } else {
                if (a - b > 50) {
                    System.out.println(100 - a + b);
                } else {
                    System.out.println(a - b);
                }
            }

        }
    }

}

/**
 * #include <iostream>
 *
 * using namespace std;
 *
 * int main()
 *
 * {
 *
 * int i,n,t;
 *
 * while(cin >> i >> n)
 *
 * {
 *
 * if(i-n>0)
 *
 * {
 *
 * t=n;
 *
 * n=i; * i=t;
 *
 * if(n-i>50)
 *
 * cout << (100-n)+i << endl;
 *
 * else * cout << n-i << endl;
 *
 * }
 *
 *
 *
 * else if(i==(-1) && n==(-1))
 *
 * return 0;
 *
 *
 *
 * else if(i==n)
 *
 * {
 *
 * cout << "0" << endl;
 *
 * }
 *
 *
 *
 * else
 *
 * {
 *
 * if(n-i>50)
 *
 * cout << (100-n)+i << endl;
 *
 * else
 *
 * cout << n-i << endl;
 *
 * }
 *
 * }
 *
 * return 0;
 *
 * }
 *
 */
