package Popup;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Brawser_arraypopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//enter the html popup search 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// search for mobiles
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles");
		
		//    //click on search button
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		 //click on 1st mobile so that new child window  will opens
		
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		//by default sselenium control should be on main window we have switch it from main window to child
	    Thread.sleep(3000);
	    
	   Set<String> allows=driver.getWindowHandles();
	    //use arraylist to store all windows
	    
	    ArrayList<String> al=new  ArrayList<String>(allows);
	    Thread.sleep(2000);
	    
	    String cw=al.get(1);
	    System.out.println(cw); 
	    Thread.sleep(2000);//childwindows
	    
	 //print main window session id

	    String mw=al.get(0);
	    System.out.println(mw); ///mainwindow
	    
	    //switch to main window
	    Thread.sleep(3000);
	    driver.switchTo().window(al.get(1));
	    //for confirmation getTitle
	  ///  String title = driver.getTitle();
	   // System.out.println(title);
	    
	    String expT="realme C11 2021 (Cool Blue, 32 GB)  (2 GB RAM)";
	    String actT = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	    System.out.println(actT);
	    
	    //verify the child window handle or not
	    Thread.sleep(3000);
	    if(actT.equals(expT))
	    {
	    	System.out.println("child window is handles and TC is pass");
	    }
	    else 
	    {
	    	System.out.println("Tc is fail");
	    }

	    
	    
	    
	    
	    

	    
	}

}
