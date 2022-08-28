package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_of_Actitime_Attributes {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(2000);
		 
		//enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
         //enter the pwd
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		//click on the button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);

		
		//enter the home page
		String expT="actiTIME - Enter Time-Track";
		String actT = driver.getTitle();
	    if(actT.equals(expT)) 
	    {
		   System.out.println("home page is opened and TC is pass");
	    }
		else
		{
		  System.out.println("Home page is not opened and Tc is fail");
		}
}


}
