package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		
		for (int j = 0; j < words.length; j++) {
			sb.append(capitalize(words[j]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				if(j != i) {
					sb.append(uncapitalize(camelcase.substring(j, i)));
				}
				if (sb.length() > 0) {
					sb.append("_");
				}
				j = i;
			}
		}
		sb.append(uncapitalize(camelcase.substring(j)));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if(s.length() > 0) {
			char first = s.charAt(0);
			char upperFirst = Character.toUpperCase(first);
			String rest = s.substring(1);
			return upperFirst + rest;
		}
		return "";
	}

	static String uncapitalize(String s) {
		if(s.length() > 0) {
			char first = s.charAt(0);
			char lowerFirst = Character.toLowerCase(first);
			String rest = s.substring(1);
			return lowerFirst + rest;
		}
		return "";
	}
	
}
