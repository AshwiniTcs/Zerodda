package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_using_ActionClass_Flipkart {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Sellinummmm4.1\\src\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//driver.manage().timeouts().implicitlyWait("Duration of sec(20)");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	WebElement Electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
	
	//create the object of the action class
	
	Actions act=new Actions(driver);
	
	act.moveToElement(Electronics).perform();
	
	WebElement Gameing = driver.findElement(By.xpath("//a[text()='Gaming']"));
	
	act.moveToElement(Gameing).perform();
	
	driver.findElement(By.xpath("//a[text()='Games']")).click();

	
	
	
	
	
}
}
