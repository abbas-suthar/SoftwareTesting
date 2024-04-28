package fbLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Connection.DriverConnection;

public class paramterizedFbLogin {
	@Parameters({"email","pass"})
	@Test
	public void login(String email,String password) {
		String url = "https://www.facebook.com/";
		WebDriver driver  = DriverConnection.getDriver(url);
		WebElement emailEle =  driver.findElement(By.id("email"));
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.sendKeys(password);
	}

}



