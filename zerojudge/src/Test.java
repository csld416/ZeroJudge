import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve() {
		
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
		String a=sc.next();
		String []aa=a.split("/");
		String s=aa[0].concat(aa[1]);
		int c=Integer.parseInt(s);
		System.out.println(c);
	}
	}
}
