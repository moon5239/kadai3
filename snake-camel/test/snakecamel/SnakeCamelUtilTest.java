package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseでnishihara_mihoからNishiharaMihoに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "NishiharaMiho";
		String actual = scu.snakeToCamelcase("nishihara_miho");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでmath_test_firstからMathTestFirstに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "MathTestFirst";
		String actual = scu.snakeToCamelcase("math_test_first");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでNishiharaMihoからnishihara_mihoに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "nishihara_miho";
		String actual = scu.camelToSnakecase("NishiharaMiho");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでMathTestFirstからmath_test_firstに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "math_test_first";
		String actual = scu.camelToSnakecase("MathTestFirst");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでappleをAppleに変える() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Apple";
		String actual = scu.capitalize("apple");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでsweetsをSweetsに変える() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Sweets";
		String actual = scu.capitalize("sweets");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでAppleをappleに変える() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple";
		String actual = scu.uncapitalize("Apple");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでSweetsをsweetsに変える() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "sweets";
		String actual = scu.uncapitalize("Sweets");
		assertThat(actual, is(expected));
	}

}
