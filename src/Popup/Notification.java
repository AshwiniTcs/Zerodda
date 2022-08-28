package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
			//create object of browser setting class
			ChromeOptions c=new ChromeOptions();
			
			//call addArgument method of browser setting class
			c.addArguments("--accept-notifications");
			//pass ref variable in chromedriver constructor
		    WebDriver driver=new ChromeDriver(c);
		    driver.get("https://www.hdfc.com");
				
				
				
				
				

	}

}
