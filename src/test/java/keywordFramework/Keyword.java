package keywordFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	
	public static WebDriver driver;
	public static void openBrowser(String bName)
	{
		switch(bName) {
		case "Chrome":
//			System.setProperty("", value)
			//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\ChromeDriver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "E:\\Selenium\\Driver\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
		}
	}
	public static void getURL(String sURL)
	{
		driver.get(sURL);
		driver.manage().window().maximize();
	}
	public static void closeBrowser()
	{
		driver.quit();
	}

}
