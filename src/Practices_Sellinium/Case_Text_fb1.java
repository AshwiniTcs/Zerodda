package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_Text_fb1 {
	
	public class Case_Attributes_fb1 {
		public void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8329401080");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ashu1080");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[type='submit']")).click();
		
		
		}
		
	}		
			

}
