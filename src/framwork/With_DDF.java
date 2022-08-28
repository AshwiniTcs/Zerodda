package framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
	
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Documents\\Zerrodda.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Zerodda");
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//enter the user name
		String un = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
		//enter the password
				String pwd = sh.getRow(0).getCell(1).getStringCellValue();
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
				
				//click on the btn login
				driver.findElement(By.xpath("//button[text()='Login ']")).click();
				
				//enter tje pin
				String pin = sh.getRow(0).getCell(2).getStringCellValue();
				driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
				//click on btn continue
				driver.findElement(By.xpath("//button[text()='Continue ']")).click();
				//String expID=driver.findElement(By.xpath(""));
				
				
				
				
	}

}
