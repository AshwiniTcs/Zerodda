package Method_Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		
		//set size of browzer
		Dimension d=new Dimension(300,300);
		driver.manage().window().setSize(d);
		
		//set the position of browser
		
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		
		driver.close();
		
		
		
	}

}
