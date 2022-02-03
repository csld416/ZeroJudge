import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a519 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int n) {
		ArrayList<Long> list = new ArrayList<>();
		list.add(1L);
		list.add(2L);
		for (int i = 2; i <= 81; i++) {
			list.add(list.get(i-1) + list.get(i-2));
		}
		System.out.println(list.get(n-1));

	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) {
				System.exit(0);
			}
			solve(n);
		}
	}

}


