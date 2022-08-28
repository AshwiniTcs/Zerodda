package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		//maximum the url
		driver.manage().window().maximize();
		//1 st pom
		
		ActLogin1 act1=new ActLogin1(driver);
		act1.enterUN();
		act1.enterPWD();
		act1.login();
		
		//2nd pom
		ActiHome act2=new ActiHome (driver);
		act2.verifyuser();
		driver.close();
		
		
	}

}
