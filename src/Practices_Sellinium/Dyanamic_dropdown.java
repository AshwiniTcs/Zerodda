package Practices_Sellinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("music");
	
	//List<WebElement> alloption=driver.findElements(By.xpath(""));
		
		
		
	}

}
