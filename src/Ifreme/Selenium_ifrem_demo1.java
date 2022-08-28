package Ifreme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ifrem_demo1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");

	   Thread.sleep(2000);
	   
	   //switch to frame no 2
	   
	   driver.switchTo().frame("iframeResult");
	   
	   //enter the first name
	   
	   driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Ashwini");
	   
	   //enter the last name
	   
	   driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Jadhav");
	    //click on the button
	   
	   driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   
	    
	    
	    
	    
	    
	    
	}

}
