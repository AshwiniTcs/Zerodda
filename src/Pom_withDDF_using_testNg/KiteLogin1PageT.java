package Pom_withDDF_using_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1PageT {
	
	//Declaration
		@FindBy(xpath="//input[@id='userid']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement PWD;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LOGINBTN;
	//step2 Initialization
		public KiteLogin1PageT (WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//Utilization
		public void enterUN(String username ) {
			UN.sendKeys(username);
		}
		public void enterPWD(String password) {
			PWD.sendKeys(password);
		}
		public void clickLOGINBTN() {
			LOGINBTN.click();
		}
}
