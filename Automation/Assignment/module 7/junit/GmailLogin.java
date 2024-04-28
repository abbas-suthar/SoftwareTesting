package Assignment;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
//	13. W.a. junit program to check gmail login using with
//	@before,@after,@Test
	static WebDriver driver=null;
	
	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/");
	}
	@Test
	public void  logIn(){
		 
	driver.findElement(By.id("identifierId")).sendKeys("invalid_email@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	

	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
}
