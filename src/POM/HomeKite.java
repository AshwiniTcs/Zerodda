package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeKite {
	
	//Declaration
	@FindBy(xpath="//span[text()='DPG458']")private WebElement userID;
	 
	
	//Initilization
	public HomeKite(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	//Utilazation
	
	public void verifyuserID()
	{
		String expID="DPG458";
		String acpID=userID.getText();
		if(expID.equals(acpID))
		{
			System.out.println("test case is pass");
		}else
		{
			System.out.println();
		}
		
		
	}
}
