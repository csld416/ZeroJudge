import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c222 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int a, int b) {
		String s1 = Integer.toBinaryString(a);
		String s2 = Integer.toBinaryString(b);
		StringBuilder ss1 = new StringBuilder(s1);
		StringBuilder ss2 = new StringBuilder(s2);
		while(ss1.length() < 32) {
			ss1.insert(0, "0");
		}
		while(ss2.length() < 32) {
			ss2.insert(0, "0");
		}
		StringBuilder ans = new StringBuilder();
		String w1[] = ss1.toString().split("");
		String w2[] = ss2.toString().split("");
		for (int i = 0; i < w2.length; i++) {
			int x = Integer.parseInt(w1[i]);
			int y = Integer.parseInt(w2[i]);
			String app;
			if(x == 1 & y == 1) {
				app = "0";
			}else if(x == 1 || y == 1) {
				app = "1";
			}else {
				app = "0";
			}
			ans.append(app);
		}
		System.out.println(Integer.parseInt(ans.toString(), 2));
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			solve(a, b);
		}
	}	

}
