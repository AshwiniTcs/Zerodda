package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mayank",Keys.TAB, "Awate",Keys.TAB,"mayankawatw2@gmail.com",Keys.TAB,"password");
		 Thread.sleep(2000);
	     WebElement m = driver.findElement(By.xpath("//select[@id='month']"));
	     driver.findElement(By.xpath("//label[text()='Female']")).click();
	     Actions act=new Actions(driver);
	 	 Thread.sleep(3000);
	 	
	 	 //this is for month
	     act.click(m).perform();
	     act.sendKeys(Keys.ARROW_UP).perform();
	 	 Thread.sleep(3000);
	     act.sendKeys(Keys.ARROW_DOWN).perform();
	     act.sendKeys(Keys.ARROW_DOWN).perform();
	     //act.sendKeys(Keys.HOME).perform();
	     act.sendKeys(Keys.ENTER).perform();
	    
	     // this is for Day
	 	 WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	     act.click(day).perform();
	     act.sendKeys(Keys.ARROW_UP).perform();
	     Thread.sleep(3000);
	     act.sendKeys(Keys.ARROW_DOWN).perform();
	     act.sendKeys(Keys.ARROW_DOWN).perform();
	     act.sendKeys(Keys.ENTER).perform();
	      
	      
	      //this is for year
	      WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	      act.click(year).perform();
	      act.sendKeys(Keys.ARROW_UP).perform();
	   	  Thread.sleep(3000);
	      act.sendKeys(Keys.ARROW_DOWN).perform();
	      act.sendKeys(Keys.ARROW_DOWN).perform();
	      act.sendKeys(Keys.ENTER).perform();
	    
	      
	   
		
			  
			
			  
	}

}
