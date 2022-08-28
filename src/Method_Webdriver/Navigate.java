package Method_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://mail.google.com/");
		  Thread.sleep(3000);
		  driver.get("https://www.amazon.com/");
		  Thread.sleep(3000);
		  //backword
		  driver.navigate().back();
		  Thread.sleep(3000);
		  
		  //forword
		  driver.navigate().forward();
		  Thread.sleep(3000);
		  
		  driver.navigate().refresh();
		  driver.close();
	}

}
