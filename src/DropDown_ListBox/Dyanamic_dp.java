package DropDown_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_dp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Music");
		Thread.sleep(2000);
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));//div[@class="pcTkSc"]/span
		//use the for each loop
		for(WebElement option:alloptions)
		{
		 String text = option.getText();
		System.out.println(text);
		 //option.click();
		// break;
		 
		 
		 
		if(text.contains("music ringtone download"))
		 {
			 option.click();
			 break;
		 }

	}
	}
}
