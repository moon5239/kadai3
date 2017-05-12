package snakecamel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SnakeかCamel式で文字を入力してください。");
		System.out.println("SnakeまたはCamelに変更します。");
		
		String s = sc.nextLine();
		
		SnakeCamelUtil scu = new SnakeCamelUtil();

		if(Character.isUpperCase(s.charAt(0))) {
			s = scu.camelToSnakecase(s);
		} else {
			s = scu.snakeToCamelcase(s);
		}

		System.out.println("結果は、" + s + "です。");
	}
}
