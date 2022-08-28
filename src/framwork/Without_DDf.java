package framwork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDf {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com");
		  //maximize the browser
	    driver.manage().window().maximize();
	    //give global wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //enter the user id
	    
	    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
	    //enter the password
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
	    //enter the login btn
	    driver.findElement(By.xpath("//button[text()='Login ']")).click();
	    
	    //enter the pin 
	    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
	    
	    //click on the btn continue
	    
	    driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	    
	    //verify user id
	    
	    String expId="DPG458";
	    String actId=driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	    if(expId.equals(actId)) {
	    	System.out.println("Both are same,TC is pass");
	    }
	    else {
	    	System.out.println("Both are not same,TC is fail"); 
	    }
	}
	}


