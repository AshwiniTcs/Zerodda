package Case_of_Relative_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_of_Contains_Xpath {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[contains(@id,'keepLoggedInLabel')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		
		String expT="actiTIME - Enter Time-Track";
		String actT=driver.getTitle();
		if(actT.equals(expT))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
}


}
