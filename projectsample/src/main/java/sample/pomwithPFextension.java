package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pomwithPFextension 
{
	
	  WebDriver driver;
	  pomwithPF pom1;
	     

	  @Test (dataProvider="PAVAN")
	  
	     public void pompf(String strUserName ,String strPassword) 
	     
	  {     
		  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Downloads\\chromedriver.exe");
	 		driver=new ChromeDriver();
	 		driver.get("https://www.facebook.com/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	 		
	 		
     	   pomwithPF pom1 = new pomwithPF(driver);
		   
     	   pom1.setUserName("Admin", "Admin");
		
		  driver.close();
}  
	   
	   @DataProvider(name = "PAVAN" )
		public Object[][] getData()
		{
		
		ExcelDataProvider config= new ExcelDataProvider("C:\\Users\\new\\Desktop\\PAVAN.xlsx");
		
		int row=config.getRows("PAVAN");
		Object[][]data=new Object[row][2];
		for (int i = 0; i<row; i++)
		{
		   data[i][0]=config.getStringData("PAVAN",i,0);	
		   data[i][1]=config.getStringData("PAVAN",i,1);	
		   
		}
		
		return data;
		
		}
}






  