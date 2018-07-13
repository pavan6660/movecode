package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectmodel 
{
	WebDriver driver;
	By username=By.xpath(".//*[@id='txtuId']");
	By password=By.xpath(".//*[@id='txtPword']");
	By sub=By.xpath(".//*[@id='login']");


public pageobjectmodel (WebDriver driver)
{
	this.driver=driver;
}

public void homepage(String uid, String psw) {
	
	driver.findElement(username).sendKeys(uid);
	driver.findElement(password).sendKeys(psw);
	driver.findElement(sub).click();
}


}
 