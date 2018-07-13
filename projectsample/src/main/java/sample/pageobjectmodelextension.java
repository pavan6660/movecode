package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pageobjectmodelextension
{
	WebDriver driver;
	 @Test
public void pavan() throws Exception
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\new\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		pageobjectmodel pom=new pageobjectmodel(driver);
		pom.homepage("Admin", "Admin");
		
		
}

}
