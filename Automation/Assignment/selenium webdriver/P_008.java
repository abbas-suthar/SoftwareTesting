package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P_008 {
//	8.	W.A.J.Script To use Mouse and Keyboard event using Action class 1.Mouse Hover Event 2. Keyboard event
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement registerbtn = driver.findElement(By.linkText("Hotels"));
		Actions action = new Actions(driver);
		action.moveToElement(registerbtn).build().perform();
		registerbtn.click();
	}
}
