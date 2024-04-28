package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P_007 {
//	7.	W.A.J.Script To write a script for drop down. http://demo.guru99.com/test/newtours/register.php 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,550)");

		WebElement dropdown = driver.findElement(By.name("country"));

		Select s = new Select(dropdown);

		boolean result = s.isMultiple();
		System.out.println(result);
		s.selectByIndex(4);
	}
}
