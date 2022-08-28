package Multiple_HandleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_handling_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		int count=0;
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		List<WebElement> ele=driver.findElements(By.xpath("//div"));
		
		for(WebElement i:ele)
		{
			String str = i.getText();
			System.out.println(str);
			count++;
		}
		
		
		
	}

}
