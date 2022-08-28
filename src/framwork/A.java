package framwork;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) throws Exception {
		
		//create the object of fileinputstream
		FileInputStream file=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Documents\\Zerrodda.xlsx");
	//	method of create()
		Sheet sh = WorkbookFactory.create(file).getSheet("Zerodda");
		//set the property
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		//lounch the or upcasting
		WebDriver driver=new ChromeDriver();
		//enter the url or application
		driver.get("https://kite.zerodha.com/");
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//screen is maximum
		driver.manage().window().maximize();
		//Enter the username
		 String UN = sh.getRow(0).getCell(0).getStringCellValue();
		    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
		    //enter the password
		    String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		    //click on the btn login
		    driver.findElement(By.xpath("//button[text()='Login ']")).click();
		    //enter the pin
		    String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
		    //enter the countinue btn
		    driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		    //verify the userid
		    String expID = sh.getRow(0).getCell(3).getStringCellValue();
		    String actID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		    if(actID.equals(expID)) 
		    {
		    		System.out.println("TC is pass");
		    }
		    else 
		    {
		    	System.out.println("TC is fail");
		    }
}
	}
