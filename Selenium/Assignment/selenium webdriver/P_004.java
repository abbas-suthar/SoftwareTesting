package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P_004 {
//	4.	W.A.J.script to register your self in Gmail
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\sutha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/");
		WebElement createaccountbtn = driver.findElement(By.xpath("//span[text() ='Create account']"));
        createaccountbtn.click();
        WebElement info = driver.findElement(By.xpath("//span[text() ='For my personal use']"));
        info.click();
	    WebElement firstname = driver.findElement(By.id("firstName"));
	    firstname.sendKeys("abbasali");
	    WebElement nextbtn = driver.findElement(By.xpath("//span[text() ='Next']"));
	    nextbtn.click();
	    Thread.sleep(2000);
	    WebElement month = driver.findElement(By.xpath("//div/select[@id='month']"));
	    Select months = new Select(month);
	    months.selectByIndex(6);
	   
	    WebElement day = driver.findElement(By.xpath(" //div/input[@id='day']"));
	       day.sendKeys("04");
	       WebElement yr = driver.findElement(By.id("year"));
	         yr.sendKeys("2004");
	         WebElement sex = driver.findElement(By.id("gender"));
	         Select gen = new Select(sex);
	         gen.selectByVisibleText("Male");
	         
	         
	         

	}

}
