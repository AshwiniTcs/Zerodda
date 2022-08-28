package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		 driver.switchTo().frame("packageListFrame");
		 String text = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();		
		
		System.out.println(text);
		Thread.sleep(2000);////,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,iframe1
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		String text2 = driver.findElement(By.xpath("//a[text()='AcceptedW3CCapabilityKeys']")).getText();
		
		System.out.println(text2);
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		String text3 = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(text3);
		
		
	}

}
