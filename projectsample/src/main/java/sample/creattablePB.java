package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class creattablePB 
{
	WebDriver driver;
	@Test(dataProvider="PAVAN") 
	
	public void PBlogin(String username,String password, String BRname,String add,String zip ) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\Downloads\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@id=\'txtuId\']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\'txtPword\']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		driver.findElement(By.xpath("//*[@id=\'Table_02\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();//branch
		driver.findElement(By.xpath("//*[@id=\'BtnNewBR\']")).click();
		driver.findElement(By.xpath("//*[@id=\'txtbName\']")).sendKeys(BRname);
		driver.findElement(By.xpath("//*[@id=\'txtAdd1\']")).sendKeys(add);
		driver.findElement(By.xpath("//*[@id=\'txtZip\']")).sendKeys(zip);
		
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\'lst_counrtyU\']"));
		org.openqa.selenium.support.ui.Select obj=new org.openqa.selenium.support.ui.Select(ele);
		obj.selectByVisibleText("INDIA");
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\'lst_stateI\']"));
		org.openqa.selenium.support.ui.Select obj1=new org.openqa.selenium.support.ui.Select(ele1);
		obj1.selectByVisibleText("GOA");
		
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\'lst_lst_cityI\']"));
		org.openqa.selenium.support.ui.Select obj2=new org.openqa.selenium.support.ui.Select(ele2);
		obj2.selectByVisibleText("GOA");
		driver.findElement(By.xpath("//*[@id=\'btn_insert\']")).click();
	} 
	
	
	@DataProvider(name = "PAVAN" )
	public Object[][] getData()
	{
	
	ExcelDataProvider config= new ExcelDataProvider("C:\\Users\\arte262_pavan\\Desktop\\PAVAN.xlsx");
	
	int row=config.getRows("PAVAN");
	Object[][]data=new Object[row][5];
	for (int i = 0; i<row; i++)
	{
	   data[i][0]=config.getStringData("PAVAN",i,0);	
	   data[i][1]=config.getStringData("PAVAN",i,1);	
	   data[i][2]=config.getStringData("PAVAN",i,2);	
	   data[i][3]=config.getStringData("PAVAN",i,3);	
	   data[i][4]=config.getStringData("PAVAN",i,4);	
	}
	  return data;
	
	
	}
	
}
