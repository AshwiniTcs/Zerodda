package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		//wait implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//maximum the page
		
		driver.manage().window().maximize();
		
		//1 st pom class
		
		Zkitlogin1 login1=new Zkitlogin1(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickbtnlogin();
		
		//2 nd pon class
		
		Zkitlogin2 login2=new Zkitlogin2(driver);
	
		login2.enterPIN();
		login2.Ctnbtn();
		
		//3rd pom class
		
		HomeKite home=new HomeKite(driver);
		home.verifyuserID();
	
	
	
	
	}

}
