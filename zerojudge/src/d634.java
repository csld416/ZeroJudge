import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class d634 {
	
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void solve() {


	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		String w[] = new String[n];
		for (int i = 0; i < w.length; i++) {
			w[i] = br.readLine();
		}
		Arrays.sort(w);
		for (int i = 0; i < w.length; i++) {
			System.out.println(w[i]);
		}
		
	}

}
