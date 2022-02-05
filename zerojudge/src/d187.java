import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d187 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int[] map = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 };
	static int kase = 1;
	public static void solve(String s) {
		char ch[] = s.toCharArray();
		int ans = 0;
		for (char c : ch) {
			if(Character.isSpaceChar(c)) {
				ans++;
			}else {
				ans += (map[(int)c-97]);
			}
		}
		System.out.println("Case #"+kase+": " + ans);
		kase++;
	}

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		while(n-- >0) {
			String s = br.readLine();
			solve(s);
		}
	}

}
