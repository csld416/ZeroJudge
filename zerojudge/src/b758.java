import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b758 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve() {
		
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
		    n = (n+2+(m+30)/60)%24;
		    m = (m+30)%60;
		    String ans1 = Integer.toString(n);
		    String ans2 = Integer.toString(m);
		    if(ans1.length() == 1) {
		    	ans1 = "0"+ans1;
		    }
		    if(ans2.length() == 1) {
		    	ans2 = "0"+ans2;
		    }
		    
			System.out.println(ans1+":"+ans2);
		}

	}

}
