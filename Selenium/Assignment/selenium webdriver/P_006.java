package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_006 {
//	6.	W.A.J. script To write the script for image of logo facebook using xpath.
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement createpg = driver.findElement(By.linkText("Create a Page"));
		createpg.click();
		WebElement logo = driver.findElement(By.xpath("//a[@title='Go to Facebook home']"));
		logo.click();
		driver.close();
	}

}
