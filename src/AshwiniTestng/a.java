package AshwiniTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\jadha\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
	 WebDriver driver= new FirefoxDriver();
	 driver.get("https://google.com/");
}
}
