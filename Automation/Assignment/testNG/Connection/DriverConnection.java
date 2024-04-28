package Connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	public static WebDriver getDriver(String url) {
			System.getProperty("webdriver.chrome.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
		
	}

}
