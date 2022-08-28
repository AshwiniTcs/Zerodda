package Method_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws Exception {
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the url
		driver.get("https://www.flipkart.com/");
		//maximum the browser
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//minimize the browser //
		Thread.sleep(3000);
		driver.manage(). window().minimize();
		Thread.sleep(5000);
		driver.close();
			
		
		
		
		}
	}


