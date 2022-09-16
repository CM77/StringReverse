package string_reverse;

import java.util.Scanner;

public class StringReverseApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			sb.reverse();
			System.out.println(sb.toString());
		}
	}

}
