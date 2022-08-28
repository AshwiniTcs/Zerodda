package Smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smoke {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		String exp="actiTIME - Login";
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");
		String acpT=driver.getTitle();
		if(acpT.equals(exp))
		{
			System.out.println("test case is pass");
		}else
		{
			System.out.println("test  case is fail");
		}
		
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		
		
		String expTH="actiTIME - Enter Time-Track";
		String actTH=driver.getTitle();
		if(actTH.equals(expTH))
		{
			System.out.println("home page is open");
		}else
		{
			System.out.println("home page is not open");
		}
		
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("ASwhini");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).clear();
	
	}

}
