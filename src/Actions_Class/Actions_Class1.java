package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the url
		driver.get("https://www.google.com/");
		//inspect to the target element
		WebElement gmail = driver.findElement(By.xpath("//a[.='Gmail']"));
		//crete the object of actions class
		Actions act=new Actions(driver);
		
		
		//......1....movetoelement() method
		act.moveToElement(gmail).perform();
		
		
		//......2....rigth click
		//act.moveToElement(gmail).contextClick().perform();
		
		
		//......3.....left click()
		//act.moveToElement(gmail).click().perform();
		
		
		//.....4.....double click.....
		//act.moveToElement(gmail).doubleClick().perform();
		
		//how to perform 3 actions in single statement
		
		act.moveToElement(gmail).contextClick().doubleClick().build().perform();
		act.scrollByAmount(0, 500).perform();
		
		
	}

}
