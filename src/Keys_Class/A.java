package Keys_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://demo.actitime.com/login.do");
		  /*  //un
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		    //pwd
		    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		    //click on login
		    driver.findElement(By.xpath("//div[text()='Login ']")).click();*/
		    
		    //using Keys class
		   driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		    		
		    

	}

}
