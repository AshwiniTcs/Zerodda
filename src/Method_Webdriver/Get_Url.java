package Method_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Url {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//getTitle
		
	String extT="Google";
	String actT=driver.getTitle();
	if(actT.equals(extT)) {
		System.out.println("test case is pass");
	}
	else
	{
		System.out.println("test case is not pass");
	}
		
}

}
