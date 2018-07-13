package sample;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class signupandsingin
{
    WebDriver driver;
	@Test
	public void signup() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Downloads\\chromedriver.exe");
 		driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		                                                                                             
 		driver.get("https://www.amazon.in/");
 	    this.takeSnapShot(driver, "C:\\Users\\new\\git\\pavan\\projectsample\\screenshots\\homepage.png");
 	    
 	    
		WebElement ele=driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']/span[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//*[@id=\'nav-flyout-ya-newCust\']/a")).click();
		driver.findElement(By.xpath("//*[@id=\'ap_customer_name\']")).sendKeys("nagamani1990");
		driver.findElement(By.xpath("//*[@id=\'ap_phone_number\']")).sendKeys("9182807915");
		driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("apavan");
		  this.takeSnapShot(driver, "C:\\Users\\new\\git\\pavan\\projectsample\\screenshots\\reg.png");
		driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']/span[2]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(ele1).build().perform();
		driver.findElement(By.xpath("//*[@id=\'nav-item-signout-sa\']/span")).click();
		
		  this.takeSnapShot(driver, "C:\\Users\\new\\git\\pavan\\projectsample\\screenshots\\signout.png");
		driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("9182807915");
		driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
		driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("apavan");
		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
		  this.takeSnapShot(driver, "C:\\Users\\new\\git\\pavan\\projectsample\\screenshots\\sign.png");
		  
		  Screen screen =new Screen();
		  Pattern image =new Pattern("C:\\Users\\new\\Desktop\\sikuli images\\search.PNG");
		  screen.type(image, "shoes");
		  driver.findElement(By.xpath("//*[@id=\'nav-search\']/form/div[2]/div/input")).click();
		  this.takeSnapShot(driver, "C:\\Users\\new\\git\\pavan\\projectsample\\screenshots\\shoespage.png");
		  
		  WebElement ele2=driver.findElement(By.xpath("//*[@id=\'sort\']"));
		  org.openqa.selenium.support.ui.Select dd=new org.openqa.selenium.support.ui.Select(ele2); 
		  dd.selectByVisibleText("Newest Arrivals");
		  
		  driver.get("http://www.google.com");
		  
		  driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[1]/div[1]/a")).click();
		  
		  List<WebElement> ele3 =driver.findElements(By.tagName("a"));
		  System.out.println("total no of links are"+ele3.size());
		  for (int i = 0; i < ele3.size(); i++) 
		  {
		System.out.println(ele3.get(i).getText());	
		}
		  
		  Thread.sleep(3000);
		driver.close();
	}
	
	public void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception
	{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
}
	
	
	
	
	
}
