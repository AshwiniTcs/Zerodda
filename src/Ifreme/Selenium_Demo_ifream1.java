package Ifreme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Demo_ifream1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//enter the 1st ifream........................1 iframe
		driver.switchTo().frame("packageListFrame");
		
		//take the 1 st element on the 1st fream
		String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		
	   
		//switch to second frame.......................2 iframe
		driver.switchTo().defaultContent();         //it will move control of sel from 1st frame to main webpage
		driver.switchTo().frame("packageFrame");
		
		//enter 1st element on the 2nd fream
		String text1 = driver.findElement(By.xpath("//a[text()='AbstractDriverOptions']")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		
		
		
		//switch to third frame.....................3
		driver.switchTo().defaultContent();         //switch control of sel from frame 2 to main webpage
		driver.switchTo().frame("classFrame");
		
		// //take any element on 3rd frame
		 String text2 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		 System.out.println(text2);
		
		
	
	
	
	
	
	
	
	
	
	}

}
