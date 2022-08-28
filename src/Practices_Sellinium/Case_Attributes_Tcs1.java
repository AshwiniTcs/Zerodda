package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Case_Attributes_Tcs1 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//enter the url
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		String expT="OrangeHRM";
		String actT=driver.getTitle();
		if(actT.equals(expT))
		{
			System.out.println("test pass");
		}else
		{
			System.out.println("test case fail");
		}
			
		
	}

}
