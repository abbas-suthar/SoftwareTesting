package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P_005 {
//	5.	W.A.J. Script To perform the radio button to select one by one in 
//	loop http://demo.guru99.com/test/radio.html
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-2"));
		radio1.click();
	}

}
