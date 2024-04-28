package Assignment;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

//	W.a. junit program to perform test with webdriver to login process of
//	facebook
	
		static WebDriver driver=null;
		
		@BeforeClass
		public static  void openBrowser() {
			System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			 driver.get("https://www.facebook.com/");
		
		}

		@Test
		public void  logIn(){
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("abbas@gmail.com");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("abbas@123");
			

	}
}
