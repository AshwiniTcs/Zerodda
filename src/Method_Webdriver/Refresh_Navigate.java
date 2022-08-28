package Method_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh_Navigate {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
				
			  //click on create new acoount btn
			  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			  
			  //enter the name and lastname and 
			  
			  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mayank",Keys.TAB,"Awate",Keys.F5);
			
	}

}
