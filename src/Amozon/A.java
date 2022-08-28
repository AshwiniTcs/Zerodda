package Amozon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Sellinummmm4.1\\src\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.amazon.in/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			  List<WebElement> allLinkElements = driver.findElements(By.tagName("img"));
			  
			  int linkListCount=allLinkElements.size();
			  System.out.println("No of Images : "+ linkListCount);
			  
			  for(int i=0;i<linkListCount;i=i+1) 
			  {
				  System.out.println("Link :"+i+"  "+allLinkElements.get(i).getAttribute("src"));
			  }
		}

	}


