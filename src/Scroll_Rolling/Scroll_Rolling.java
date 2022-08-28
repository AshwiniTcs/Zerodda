package Scroll_Rolling;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Rolling {

	
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			//typecast javascriptexecutor
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;//type casting but JavascriptExecutor is not there in webdriver interface .JavascriptExecutor in the selenuim and it is typecasting to the webdriver inter face and his method is windows.scrollby so this method is x and y co-ordinates.
			jse.executeScript("window.scrollBy(0,3000);");
			Thread.sleep(2000);
			
			jse.executeScript("window.scrollBy(0,-3000);");
			

	}

}                    








