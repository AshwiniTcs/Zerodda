package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zkitlogin1 {  //ulc
	
	//step 1  Declarations
	
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement login;
	
	//step 2 Innitilazation
	
	public Zkitlogin1(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//step 3 utilazation or implementation
	
	public void enterUN()
	{
		UN.sendKeys("DPG458");
	}
	
	public void enterPWD()
	{
		PWD.sendKeys("Amol@1234");
	}
	
	public void clickbtnlogin()
	{
		login.click();
	}
	
	
	

}
