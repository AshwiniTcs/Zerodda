package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		  //click on create new acoount btn
		  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		  
		  
		  driver.findElement(By.xpath("//input[@id='u_3_b_hg']")).sendKeys("Mayank");//enter the name
		  driver.findElement(By.xpath("//input[@id='u_3_d_7X']")).sendKeys("Aawate");//enter the surname
		//  driver.findElement(By.xpath("")).sendKeys("8329401080");//enter the email 
		  //driver.findElement(By.xpath("")).sendKeys("myu028");
		    //select list box of month
		 // Thread.sleep(3000);
		  WebElement month=driver.findElement(By.xpath("//select[@id='month']"));

		  //create object of Actions class
	 Actions act=new Actions(driver);
		  //click on month
		
	
		act.click(month).perform();
		  //move to upside
		  Thread.sleep(3000);
		  act.sendKeys(Keys.ARROW_UP).perform();
		  act.sendKeys(Keys.ARROW_UP).perform();
		  act.sendKeys(Keys.ARROW_UP).perform();
		  
		    //move to upside
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ARROW_UP).perform();
	  act.sendKeys(Keys.ARROW_UP).perform();
	  act.sendKeys(Keys.ARROW_UP).perform();
	  //move down
	  Thread.sleep(3000);
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  //select topmost element
	  act.sendKeys(Keys.HOME).perform();
	  //click on element
	  act.sendKeys(Keys.ENTER).perform();
	  

}}