 package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task1
{
WebDriver driver;
@Test
public void test() throws Exception 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\Downloads\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	
	
	driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]")).click();
  
	
	String pw = driver.getWindowHandle();
	
	driver.findElement(By.xpath(".//*[@id='shopAllLinks']/tbody/tr/td[1]/div[1]/ul/li[1]/a")).click();
    for (String cw : driver.getWindowHandles())
	{
	    driver.switchTo().window(cw); 
	}
	
	driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("shoes for men");
	driver.findElement(By.xpath("//*[@id=\'nav-search\']/form/div[2]/div/input")).click();
	Thread.sleep(10000);
	
	driver.switchTo().window(pw);
	
    driver.findElement(By.xpath("//*[@id=\'navFooter\']/table/tbody/tr/td[7]/ul/li[1]/a")).click();
	driver.navigate().back();
	driver.get("https://www.irctc.co.in/");

	driver.findElement(By.xpath("//*[@id=\'destination\']/span/input")).sendKeys("SECUNDERABAD JN - SC");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/button")).click();
	driver.findElement(By.xpath(".//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr[3]/td[3]/a")).click();
	driver.findElement(By.xpath(".//*[@id='journeyClass']/div/div[3]")).click();
	driver.findElement(By.xpath(".//*[@id='journeyClass']/div/div[4]/div/ul/li[5]/span")).click(); 
	
	driver.findElement(By.xpath(".//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[6]/div[1]/label")).click();
	driver.findElement(By.xpath(".//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")).click();
	
	driver.get("https://www.facebook.com/");
	
 org.openqa.selenium.support.ui.Select obj =new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath(".//*[@id='day']")));
 obj.selectByVisibleText("17");
 org.openqa.selenium.support.ui.Select obj1 =new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath(".//*[@id='month']")));
 obj1.selectByIndex(10);
 org.openqa.selenium.support.ui.Select obj2 =new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath(".//*[@id='year']")));
obj2.selectByValue("2018");

Thread.sleep(5000);
driver.findElement(By.linkText("Sports")).click();
Thread.sleep(5000);
driver.findElement(By.partialLinkText("stagram")).click();
Thread.sleep(5000);
 driver.quit();
}}
