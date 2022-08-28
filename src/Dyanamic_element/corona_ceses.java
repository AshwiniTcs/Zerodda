package Dyanamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class corona_ceses {

	
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.worldometers.info/coronavirus/country/uk");
			Thread.sleep(2000);
			
			   //get the text of recovered cases
		    String recover = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[3]")).getText();				 
		    System.out.println( recover);
		    
		    //get the text of death cases
		    String death = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[2]")).getText();				 
		    System.out.println( death);
		    
		    //get the text of death cases
		    String corona = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();				 
		    System.out.println(corona);
	}

}
