package Page;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesLogin {
	
	WebDriver driver;
	public SalesLogin(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	 @FindBy(xpath="//div[contains(text(),'ADP Sales Sign Up')]")
	 private WebElement sales;
	
	 @FindBy(xpath="//input[@name='name']")
	 private WebElement name;
	 
	 @FindBy(xpath="//input[@name='associateId']")
	 private WebElement id;
	 
	 @FindBy(xpath="//input[@name='salesCode']")
	 private WebElement sc;
	 
	 @FindBy(xpath="//input[@name='salesEmail']")
	 private WebElement se;
	 
	 @FindBy(xpath="//div[contains(text(),'@adp.com')]")
	 private WebElement adp;
	 
	 @FindBy(xpath="//div[contains(text(),'@grr.la')]")
	 private WebElement grr;
	 
	 @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
	 private WebElement pass;
	 
	 @FindBy(xpath="//input[@name='confirmPassword']")
	 private WebElement conf;
	 
	 @FindBy(xpath="//span[contains(text(),'Request Access')]")
	 private WebElement req;
	 
	 
	 public void sale(String name_1,String id_1, String code, String email,String password,
			 String confirm) throws InterruptedException {
		// TODO Auto-generated method stub
		 sales.click();
		 name.sendKeys(name_1);
		 Thread.sleep(1000);
		 id.sendKeys(id_1);
		 sc.sendKeys(code);
		 Thread.sleep(2000);
		 se.sendKeys(email);
		 Thread.sleep(500);
		 adp.click();
		 Thread.sleep(500);
		 grr.click();
		 Thread.sleep(1000);
		 pass.sendKeys(password);
		 conf.sendKeys(confirm);
		 req.click();	
		//String element1=id.getAttribute("value");
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(2000);
		String element1="https://www.guerrillamail.com/inbox";
		driver.get(element1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.manage().window().maximize();
		 
		 
}	

}
