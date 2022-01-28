import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d566 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String state[][],int i) {
		int k = 0;
		for (int a = 0; a < i; a++) {
			boolean find = false;
			String name = sc.next();
			for (int b = 0; b < i; b++) {
				if (name.equals(state[b][0])) {
					state[b][1] = sc.next();
					if (state[b][1].equals("AC"))
						state[b][2] = "Y";
					find = true;
					break;
				}
			}
			if (!find) {
				state[k][0] = name.toString();
				state[k][1] = sc.next();
				if (state[k][1].equals("AC"))
					state[k][2] = "Y";
				k++;
			}
		}
		int AC = 0, player = 0;
		for (int a = 0; a < i; a++) {
			if (state[a][0] != null) {
				if (state[a][2] != null) {
					if (state[a][2].equals("Y"))
						player++;
				}
				if (state[a][1].equals("AC"))
					AC++;
			}
		}
		System.out.println(AC * 100 / player + "%");
		//break;
	}

	public static void main(String[] args) {
		int i = sc.nextInt();
		String[][] a = new String[i][3];
		solve(a, i);
	}

}
