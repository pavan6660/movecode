package sample;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
public class sikuli 
{   WebDriver driver;
    @Test
          public void sikuli1() throws Exception {
    	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\new\\Downloads\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  
		  driver.get("https://www.facebook.com/");
    	  Screen screen = new Screen();
    		 
    	  Pattern image1 = new Pattern("C:\\Users\\new\\Desktop\\sikuli images\\firstname.png");
    	  screen.type(image1, "pavan");
    	  Pattern image2 = new Pattern("C:\\Users\\new\\Desktop\\sikuli images\\surname.png");
    	  screen.type(image2, "arella");
    	
    		driver.close();
    		
    	}

    	
    	
    	
    }

