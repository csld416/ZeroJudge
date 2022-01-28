import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e976 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(String s) {
		String w[] = s.split("\\s");
		int a[] = new int[w.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(w[i]);
		}
		if(a[0]*a[2] >= a[1]) {
			System.out.println(s+". I will make it!");
		}else {
			System.out.println(s+". I will be late!");
		}
	}
	
	public static void main(String[] args) throws IOException{
		while(sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}

	}

}
