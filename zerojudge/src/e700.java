import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e700 {

	final static Scanner sc = new Scanner(System.in);
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void solve(String s) {
		String w[] = s.split("/");
		int a = Integer.parseInt(w[0]);
		int b = Integer.parseInt(w[1]);
		a = a * 100;
		b += a;
		String ans = "";
		if (b >= 121 && b <= 219) {
			ans = "���~�y";
		} else if (b >= 220 && b <= 320) {
			ans = "�����y";
		} else if (b >= 321 && b <= 420) {
			ans = "�d�Ϯy";
		} else if (b >= 421 && b <= 521) {
			ans = "�����y";
		} else if (b >= 522 && b <= 621) {
			ans = "���l�y";
		} else if (b >= 622 && b <= 722) {
			ans = "���ɮy";
		} else if (b >= 723 && b <= 821) {
			ans = "��l�y";
		} else if (b >= 822 && b <= 923) {
			ans = "�B�k�y";
		} else if (b >= 924 && b <= 1023) {
			ans = "�ѯ��y";
		} else if (b >= 1024 && b <= 1122) {
			ans = "���Ȯy";
		} else if (b >= 1123 && b <= 1222) {
			ans = "�g��y";
		} else if (b >= 1223 && b <= 1231) {
			ans = "���~�y";
		} else {
			ans = "���~�y";
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.nextLine();
			solve(s);
		}

	}

}
