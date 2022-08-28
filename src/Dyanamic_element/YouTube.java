package Dyanamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws Exception {	
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		  //click on cancel btn
	    Thread.sleep(3000);
	 String rating = driver.findElement(By.xpath("(//div[@class=\"style-scope ytd-video-meta-block\"]//span)[2]")).getText();
	 System.out.println(rating);
	 
	 
	 
}
}