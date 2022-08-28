package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Element_Screenshot {
public static  void main(String[] args) throws IOException  {
			System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
	  //i want to take scrnshot of particular element(inspect element store in ref variable)
			
			WebElement gTitle=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
			
			File scr=gTitle.getScreenshotAs(OutputType.FILE);
			
		    //store at destination
			
			File dest=new File("C:\\Users\\jadha\\OneDrive\\Desktop\\Myank\\Googletitle.jpg");
			
			//source to destination
			Files.copy(scr,dest);
			
			
			
			
			
			
	}

}