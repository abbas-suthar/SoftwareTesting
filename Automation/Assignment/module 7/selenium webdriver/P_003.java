package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_003 {
//	3.	W.A.J. script to use different methods to manage the windows-alerts and pop ups.
	public static void main(String[] args) {
	System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
}
	
