package keywordFramework;

import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void Test1() {
		Keyword.openBrowser("Chrome");
		Keyword.getURL("https://www.naukri.com");
		Keyword.closeBrowser();
	}
	
}
