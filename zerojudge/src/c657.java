import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c657 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		int maxTime, currTime;
		char maxChar = 'f', nowCharacter;

		maxTime = 0;
		nowCharacter = s.charAt(0);
		currTime = 1;
		for (int i = 1; i != s.length(); i++)
			if (s.charAt(i) != nowCharacter) {
				if (currTime > maxTime) {
					maxTime = currTime;
					maxChar = nowCharacter;
				}
				nowCharacter = s.charAt(i);
				currTime = 1;
			} else {
				currTime++;
			}
		if (currTime > maxTime) {
			maxTime = currTime;
			maxChar = nowCharacter;
		}

		System.out.println(maxChar + " " + maxTime);

	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}

	}

}
