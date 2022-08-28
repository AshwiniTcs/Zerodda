package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_popup {

	public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			//enter the html popup search for mobiles
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
			
			// search for mobiles
			driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Mobiles");
			
			//    //click on search button
			driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
			Thread.sleep(2000);
			
			//click on 1st mobile so that new child window  will opens
			  driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
			
			  //by default sselenium control should be on main window we have switch it from main window to child
	
			  Set<String> allws = driver.getWindowHandles();
			    for(String singlewin:allws) {
			    	driver.switchTo().window(singlewin);//now ur selenium control goes from main win to child
			    }
			  
			    //get the text of child for our confirmation
			    Thread.sleep(3000);
			    String expT="realme C11 2021 (Cool Blue, 32 GB)  (2 GB RAM)";
			    String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
			    System.out.println(actT);
			    
			    //verify the child window handle or not
			    Thread.sleep(3000);
			    if(actT.equals(expT)) {
			    	System.out.println("child window is handles and TC is pass");
			    }
			    else {
			    	System.out.println("Tc is fail");
			    }
			    
			}

	
	
	
	
	
	
	}
	
	
	
	


