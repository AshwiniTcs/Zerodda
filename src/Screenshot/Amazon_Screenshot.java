package Screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Amazon_Screenshot {



		public static  void main(String[] args) throws Throwable {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\jadha\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			//typecast TakeScreenshot interface
			 TakesScreenshot ts=(TakesScreenshot)driver;
			 //use getscreenshotAs()
			 File scr=ts.getScreenshotAs(OutputType.FILE);
			//we have to store screenshit at particular dwstinTION create object of file class
			 File dest=new File("C:\\Users\\jadha\\OneDrive\\Desktop\\Testing Engineering\\AMAZON.jpg");
			//u have to transfer file source to destination(ya adhi amhi findhandler vapraycho)
			 Files.copy(scr, dest);
		
		}

}
