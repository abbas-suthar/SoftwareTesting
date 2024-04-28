package fbLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Connection.DriverConnection;
//15. W.a. TestNG program to perform test with webdriver to login processof
//facebook

public class fbLoginTest {
	@Test
	public void  login( ) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	WebElement email =	driver.findElement(By.id("email"));
		email.sendKeys("Abc@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Abc");
}
}
