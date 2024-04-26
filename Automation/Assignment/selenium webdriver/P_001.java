package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class P_001 {
//	 1.	W.A.J.Script for Locating links by linkText() and partialLinkText() 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mysy.guj.nic.in/");
		

		// Find Element by Partiallink text :
		WebElement partiallink = driver.findElement(By.partialLinkText("Student"));
		partiallink.click();

		// Find Element by linkText :
		WebElement forgotpass = driver.findElement(By.linkText("Forgot Password"));
		forgotpass.click();

	}
}
