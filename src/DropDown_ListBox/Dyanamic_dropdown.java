package DropDown_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_dropdown {

	public static void main(String[] args)  throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("kgf");
	    Thread.sleep(3000);//(****it is mandatory)
	    //inspect elements
	    List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	    //use for each loop
	   for(WebElement option:alloptions) 
	    {
	    	String text = option.getText();
	    	
	    
	   System.out.println(text);
	    	
	    	 Thread.sleep(3000);
	    	if(text.contains("kgf chapter 2 full movie"))
	    	{
	    		option.click();
	    		break;
	    	}
	    	
	    	
	 /*   if(text.contains("kgf 2 box office collection"))
	    	{
	    		option.click();
	    		break;
	    		
	    	}
	    	
	    	if(text.contains("K.G.F: Chapter 1"))
	    	{
	    		option.click();
	    		break;
	    		
	    	}
	  */
	}
	}
	}