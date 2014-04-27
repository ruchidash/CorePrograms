package anagram;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnagramTest {
	@DataProvider(name = "param")
	public static Object[][] testData() {
		return new Object[][] { { null, null, true }, { "a", null, false } };
	}

	@Test(dataProvider = "param")
	public void testAnagram(String str1, String str2, boolean expectedValue) {
		Anagram an = new Anagram();

		boolean result = an.isAnagram(str1, str2);
		assertEquals(expectedValue, result);

	}
}
