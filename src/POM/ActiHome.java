package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiHome {//blc
	
	//Declaration 
	@FindBy(xpath="//a[@class='userProfileLink username ']")private WebElement user;
	
	//initilization
	public ActiHome(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//utilazation
	public void verifyuser() {
		String expT="John Doe";
		String acpT=user.getText();
		if(expT.equals(acpT))
		{
			System.out.println("test case is pass");
		}else
		{
			System.out.println("test case is fail");
		}
	}

}
