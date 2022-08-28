package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
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
			
		
			
			//click on the logout
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			
			Thread.sleep(2000);
			
	    	String expT=("actiTIME - Enter Time-Track");
			String acpT=driver.getTitle();
			if(acpT.equals(expT))
			{
				System.out.println("test case is pass");
			
			}
			else
			{
				System.out.println("test case is fail");
			
			}
	}
}

