import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a221 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int kase = 1;
	public static String solve(String q, String ans) {
		//AC
		if(q.equals(ans)) {
			return "Yes";
		}
		//OFE (ignore space, q == ans)
		String e = q.replaceAll("\\s+", "");
		if(e.equals(ans)) {
			return "Output Format Error";
		}
		//WA  (ignore space, q != ans)
		else {
			return "Wrong Answer";
		}
	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			String q = br.readLine();
			String ans = br.readLine();
			System.out.print("Case "+kase+": " + solve(q, ans));
			System.out.println();
			kase++;
		}
	}

}
