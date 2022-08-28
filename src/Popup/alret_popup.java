  package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alret_popup {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.guru99.com/test/delete_customer.php");
			
				//enter the custmoer id
				driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("121245");
				
				
				//click on the button submit
				driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		   
			
			   //switch from main webpage to popup
				Alert alt = driver.switchTo().alert();
				Thread.sleep(2000);
			
			//click on the button ok
				
				alt.accept();
				//alt.dismiss();
			    //vget the text of popup
				Thread.sleep(2000);
				String text = alt.getText();
				System.out.println(text);
				
	}

}
