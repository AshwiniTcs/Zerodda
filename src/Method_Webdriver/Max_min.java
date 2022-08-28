package Method_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_min {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:www.google.com/");
		Thread.sleep(3000);
		//maximize the windows
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//minimize the windows
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		
		
		
	}

}
