package DropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_DropDrown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		String expT="OrangeHRM";
		String actT=driver.getTitle();
		if(actT.equals(expT))
		{
			System.out.println("test pass");
		}else
		{
			System.out.println("test case fail");
		}
		
				//open the home page.click on the button admin 
				driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
					
				//open the drop down 
				WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"empsearch_job_title\"]"));

				//create the object of the select class
				Select s=new Select(dropdown);
				s.selectByVisibleText("Database Administrator");         //use the method of select class 
				
				//open the drop down 
				
				WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"empsearch_employee_status\"]"));
				
				Select s1=new Select(dropdown1);
				
				//use the method of select class 
				s1.selectByIndex(6);
				//open the drop down 
				
				WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"empsearch_termination\"]"));
				
				Select s2=new Select(dropdown2);		//use the method of select class 
				
		        s2.selectByIndex(0);		


		
		
		

	}

}
