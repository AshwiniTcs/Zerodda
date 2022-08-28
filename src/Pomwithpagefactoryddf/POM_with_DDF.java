package Pomwithpagefactoryddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_with_DDF {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Documents\\Zerodda.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Zeroda");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jadha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	    //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    //call 1st pom class  
	    Zkitelogin1 login1=new Zkitelogin1(driver);
	    String username = sh.getRow(0).getCell(0).getStringCellValue();
	    login1.enterUN(username);
	    
	    String password = sh.getRow(0).getCell(1).getStringCellValue();
	    login1.enterPWD(password);
	    
	    login1.clickLOGINBTN();
	    
	    //call 2nd pom class
	    kielogin2  login2=new kielogin2 (driver);
	    String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
	    login2.enterPIN(pinvalue);
	    
	    login2.clickcntBtn();
	    
	    //call 3rd pom class
	    Home home=new Home(driver);
	    	 String expuserid = sh.getRow(0).getCell(0).getStringCellValue();
	    	 home.verifyuserID(expuserid);
	    	 driver.close();
	    
		
		
	}

}
