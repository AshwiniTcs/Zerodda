package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Random_Screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.amazon.com/");
		
		//first we create the windows is maximam
		driver.manage().window().maximize();
		//after that we take radom string bcoz 
		
		String random=RandomString.make();
		
		//then we tapecast takescreenshot interface
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//then we use method of takescreenshot ........getscreenshotAs()
		File src=ts.getScreenshotAs(OutputType.FILE);//FILE is class
		
		 //we have to store screenshit at particular dwstinTION create object of file class
		
		File dest=new File("C:\\Users\\jadha\\OneDrive\\Desktop\\Testing Engineering\\"+random+".jpg");
		  //u have to transfer file source to destination(ya adhi amhi findhandler vapraycho)
		
		Files.copy(src,dest);
		

	}

}
