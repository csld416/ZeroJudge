import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e390 {
	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String s = "﹏兝α么功吒吭沔坼歿俞枯苒娉珮豹崤淚許廄琵跚愧稞鈾暝蓋墦穀閱璞餐縷擺黠孀髏躡ふж尐佢汻岤狖垥柦胐娖涂罡偅惝牾莍傜揊焮茻鄃幋滜綅赨塿槙箤踊嫹潿蔌醆嬞獦螏餤燡螰駹礒鎪瀙酀瀵騱酅贕鱋鱭";

	public static void solve(String c) {
		char[] ch = s.toCharArray();
		boolean t = false;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == c.charAt(0)) {
				t = true;
				break;
			}
		}
		System.out.println(t  == true? "Yes": "No");
	}

	public static void main(String[] args) {
		while(sc.hasNext()) {
			String c = sc.next();
			solve(c);
		}
	}
}
