package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	   driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(4000);
	    String expT="actiTIME - Enter Time-Track";
	    Thread.sleep(2000);
	    String actT = driver.getTitle();
	    if(actT.equals(expT)) {
	    	System.out.println("Home page is opened,TC is pass");
	    }
	    else {
	    	System.out.println("Home page is not open, Tc is fail");
	    }
	}

}
