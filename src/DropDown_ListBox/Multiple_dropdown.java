package DropDown_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\jadha\\OneDrive\\Desktop\\B.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"GoodLUck\"]"));
	//create object of select class
		
		Select s=new Select(dropdown);
		  //check whether DD is multiselctable or not
		
		if(s.isMultiple())
		{
			System.out.println("given dd is pass");
		}else
		{
			System.out.println("given dd is fail");
		}
	
		 //get size of all options
		
	List<WebElement>allelements=s.getOptions();
	//get the text of all elements
	
	for(int i=0;i<=allelements.size()-1;i++)
	{
	WebElement onelement= allelements.get(i);
	String text= onelement.getText();
	System.out.println(text);
	}

}}

