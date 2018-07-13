package sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomwithPF 
{ 
	WebDriver driver;
	@FindBy(xpath="//*[@id=\'email\']")
	
	WebElement user99GuruName;

    @FindBy(xpath="//*[@id=\'pass\']")

    WebElement password99Guru;

    @FindBy(xpath="//*[@id=\'u_0_2\']")

    WebElement login;

    public pomwithPF (WebDriver driver)  
    {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

   
    public void setUserName(String strUserName ,String strPassword){

        user99GuruName.sendKeys(strUserName);
        password99Guru.sendKeys(strPassword);
        login.click();

    }


    public void pom(String strUserName,String strPasword){

    
        this.pom(strUserName,strPasword);
       	

}
    }
