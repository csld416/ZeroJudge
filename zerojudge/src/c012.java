import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class c012 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int count[][] = new int[300][2];
	static {
		for (int i = 0; i < 300; i++) {
			count[i][0] = i;
		}
	}
	static boolean first = true;

	public static void solve(String s) {
		if (!first) {
			for (int i = 0; i < 300; i++) {
				count[i][0] = i;
				count[i][1] = 0;
			}
			System.out.println();
		}

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)][1]++;
		}
		Arrays.sort(count, new Comparator<int[]>() {
			@Override
			public int compare(int[] x, int[] y) {
				if (x[1] > y[1]) {
					return 1;
				} else if (x[1] < y[1]) {
					return -1;
				} else {
					if (x[0] < y[0])
						return 1;
					else
						return -1;
				}
			}
		});

		for (int i = 0; i < 300; i++) {
			if (count[i][1] != 0)
				System.out.println(count[i][0] + " " + count[i][1]);
		}

		first = false;

	}

	public static void main(String[] args) throws IOException {
		while(sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}

}
