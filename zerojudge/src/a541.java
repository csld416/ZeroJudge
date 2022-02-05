import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class a541 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<String> a = new ArrayList<>();
	static ArrayList<String> b = new ArrayList<>();
	public static void solve() {
		for (int i = 0; i < b.size(); i++) {
			if(a.contains(b.get(i))) {
				System.out.println("yes");
			}else {
				System.out.println("no");
				a.add(b.get(i));
			}
		}

	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		while(n-- >0) {
			a.add(br.readLine());
		}
		int m = Integer.parseInt(br.readLine());
		while(m-- >0) {
			b.add(br.readLine());
		}
		solve();
	}

}
