package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refreah {


		 //how stale element reference exception generated
			 public static void main(String[] args) {
			 	System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
			     WebDriver driver=new ChromeDriver();
			     driver.get("https://www.google.com/");
			     WebElement txtfield = driver.findElement(By.xpath("//input[@name='q']"));//@1010
			     txtfield.sendKeys("Indian movie");
			     driver.navigate().refresh();//@2020
			     txtfield.sendKeys("Sairat");
			     
	}

}
