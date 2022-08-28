package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zkitlogin2 {//ulc
	
	//Declaration
	
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement Ctnbtn;

	//initilization
	
	public Zkitlogin2(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	
	//Utilization or implementation
	
	public void enterPIN()
	{
		PIN.sendKeys("171992");
	}
	public void Ctnbtn()
{
		Ctnbtn.click();
		}
}
