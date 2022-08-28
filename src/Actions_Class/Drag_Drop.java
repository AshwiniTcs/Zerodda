package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the url
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		  //inspect first element and store in ele1
            WebElement ele1 = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
            
            WebElement ele2 = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		//create the object of Action class
            Actions act=new Actions(driver);
            act.dragAndDrop(ele1, ele2).perform();
		
		
		
		

	}

}
