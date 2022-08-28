package Dyanamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Dyanamic {

	public static void main(String[] args) throws Exception {	
	
			System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			  //click on cancel btn
		    Thread.sleep(3000);
		    
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			//search for m,obile
		    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobiles under 2000",Keys.ENTER);
		Thread.sleep(2000);
		
		//naviagate to dynamic element(make sure that u r taking class)
		String rating = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[4]")).getText();
		System.out.println(rating);
		
		 //using descendant(opttional)
		
		//String rating1 = driver.findElement(By.xpath("")).getText();
		//System.out.println(rating1);
		
		
		
	}

}
