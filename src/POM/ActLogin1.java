package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActLogin1 {       //BLC
	
	//Declaration
	
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	@FindBy(xpath="//div[text()='Login ']")private WebElement login;
	
	//Initilization
	
	public ActLogin1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilazation
	
	public void enterUN()
	{
		UN.sendKeys("admin");
	}
	
	public void enterPWD()
	{
		PWD.sendKeys("manager");
	}
	
	public void login()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	

}
