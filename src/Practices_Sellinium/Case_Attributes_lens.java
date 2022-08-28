package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_Attributes_lens {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.lenskart.com/");
				Thread.sleep(2000);
				
				
				
				driver.findElement(By.xpath("//span[text()='Sign In']")).click();
				Thread.sleep(2000);
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ashwini");
				//Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Awate");
			//	Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8329401080");
			//	Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jadhavashwinim9412@gmail.com");
			//	Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			//	Thread.sleep(2000);
				
				//driver.findElement(By.xpath("//a[@class='button is-dark']")).click();
				
				
			/*	String expT="Buy Gradient Online | Shop for Gradient at Low Price - Lenskart.com";
				String actT=driver.getTitle();
				if(actT.equals(expT))
				{
					System.out.println("test case is pass and home is open");
				}
				else
				{
					System.out.println("test case is fail home page is not open");
				}
*/
			

			}



}
