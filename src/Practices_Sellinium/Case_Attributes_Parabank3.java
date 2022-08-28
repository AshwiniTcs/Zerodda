package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_Attributes_Parabank3 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://secure.parabank.us/authentication");
				Thread.sleep(2000);
				
				
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[@id='login']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[@class='button is-dark']")).click();
				

			

			}



}
