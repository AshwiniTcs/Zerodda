package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	@Parameters("browsername")//annotation  parameter is keyword
	@Test
	public void Browser(String browsername)  //paramerized method
	{
		WebDriver driver=null;  //runtime Polimorphism
		if(browsername.equals("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\jadha\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 driver= new FirefoxDriver();
		}
		
		driver.get("https://www.flipkart.com/"); 
}
}