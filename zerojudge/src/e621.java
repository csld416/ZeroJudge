
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class e621 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int r, ret;

	public static void solve(int a, int b, int c) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = a + 1; i < b; ++i) {
			if (i % c != 0) {
				list.add(i);
			}

		}
		if (list.size() == 0) {
			System.out.println("No free parking spaces.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
		}

	}

	public static int readint() throws Exception {
		ret = 0;
		r = br.read();
		while (r > 47 && r < 58) {
			ret *= 10;
			ret += (r & 15);
			r = br.read();

		}
		return ret;
	}

	public static void main(String[] args) throws Exception {
		int n = readint();
		while (n-- > 0) {
			int a = readint();
			int b = readint();
			int c = readint();
			solve(a, b, c);
		}

	}

}
