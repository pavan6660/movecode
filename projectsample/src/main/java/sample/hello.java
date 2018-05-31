package sample;

import java.io.File;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class hello 
{
	WebDriver driver;
	 @Test
public void pavan() throws Exception
	{
		Logger logger=Logger.getLogger("hello");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\new\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		logger.info("application launched");
		driver.get("https://www.facebook.com/");
		logger.info("url launced");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File("./screenshots/pavan.png"));
		logger.info("screenshot taken");
		System.out.println("hello pavan");
	    driver.close();
}
}
