import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e968 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i+1);
		}
		for (int i = 0; i < 3; i++) {
			Integer y  = sc.nextInt();
			list.remove(y);
		}
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("No. "+list.get(i));
		}
	}
	
	public static void main(String[] args) {
		while(sc.hasNext()) {
			int n = sc.nextInt();
			solve(n);
		}
	}	

}
