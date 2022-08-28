package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_css1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  //selector css
		  driver.findElement(By.cssSelector("input[aria-haspopup='false']")).sendKeys("Ashwini");


}

}
