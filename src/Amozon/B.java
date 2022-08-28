package Amozon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		WebElement image1 = driver.findElement(By.xpath("(//IMG[@class='w-100 shadow-1-strong rounded selenium-backer-logo'])[6]"));
		WebElement image2 = driver.findElement(By.xpath("(//IMG[@class='w-100 shadow-1-strong rounded selenium-backer-logo'])[8]"));
		WebElement image3 = driver.findElement(By.xpath("(//IMG[@class='w-100 shadow-1-strong rounded selenium-backer-logo'])[4]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Boolean status1 =(Boolean) jse.executeScript("return arguments[0].complete"+"&& typeof arguments[0].naturalWidth !=\"undefined\" " + "&& arguments[0].naturalWidth >0",image1);
		Boolean status2 =(Boolean) jse.executeScript("return arguments[0].complete"+"&& typeof arguments[0].naturalWidth !=\"undefined\" " + "&& arguments[0].naturalWidth >0",image2);
		Boolean status3 =(Boolean) jse.executeScript("return arguments[0].complete"+"&& typeof arguments[0].naturalWidth !=\"undefined\" " + "&& arguments[0].naturalWidth >0",image3);

		if(status1 && status2 && status3) {
		System.out.println("All images loaded");
		}else {
		System.out.println("All images not loaded");
		}
		driver.quit();
		}
	}


