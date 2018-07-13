package sample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoIT
{
	WebDriver driver;
	@Test
	public void autoit() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://topdf.com/");	
		  driver.findElement(By.xpath("//*[@id=\'pick-files\']/span[2]")).click();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\Users\\new\\Desktop\\autoit.exe");
			
	}

}
