import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class e394 {
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String c = "﹏兝α么功吒吭沔坼歿俞枯苒娉珮豹崤淚許廄琵跚愧稞鈾暝蓋墦穀閱璞餐縷擺黠孀髏躡ふж尐佢汻岤狖垥柦胐娖涂罡偅惝牾莍傜揊焮茻鄃幋滜綅赨塿槙箤踊嫹潿蔌醆嬞獦螏餤燡螰駹礒鎪瀙酀瀵騱酅贕鱋鱭";

	public static void solve(String s) {
		char[] ch = c.toCharArray();
		String w[] = s.split("");
		ArrayList<String> input = new ArrayList<>();
		boolean t = false;

		Arrays.sort(w);
		
		for (int i = 0; i < w.length; i++) {
			input.add(w[i]);
		}
		
		for (int i = ch.length-1; i > -1; i--) {
			if (input.contains(Character.toString(ch[i]))) {
				t = true;
				break;
			}
		}
		System.out.println(t == true ? "Yes" : "No");
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}
	}
}
