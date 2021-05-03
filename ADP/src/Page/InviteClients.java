package Page;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InviteClients {
	WebDriver driver;
	
	public InviteClients(WebDriver driver) 
	{
	this.driver=driver;
    PageFactory.initElements(driver, this);
}
	
	 @FindBy(xpath="//div[contains(text(),'Order')]")
	 private WebElement order;
	
	@FindBy(xpath="//span[contains(text(),'Invite Client')]")
	private WebElement add;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement i_name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@name='legalAddressBean.streetAddress']")
	private WebElement legal;
	
	@FindBy(xpath="//input[@name='legalAddressBean.city']")
	private WebElement i_city;
	
	 @FindBy(xpath = "//div[contains(text(),'Select state')]")
	 private WebElement state;

	@FindBy(xpath = "(//div[.='CO-Colorado'])[1]")
	private WebElement co;
	
	@FindBy(xpath="//input[@name='legalAddressBean.zip']")
	private WebElement i_zip;
	
	@FindBy(xpath="//input[@name='feinNumber']")
	private WebElement fien;
	
	@FindBy(xpath="//input[@name='legalBusinessName']")
	private WebElement business;
	
	@FindBy(xpath="//input[@name='dbaName']")
	private WebElement dba;
	
	@FindBy(xpath="//button[@type='submit']//div")                      ////span[contains(text(),'Copy Link')]
	private WebElement submit;

	@FindBy(xpath="//input[@id='refferal']")
	private WebElement id;
	
	public void inviteclients(String name,String email,String streetAddress,String city,String zip,
			String feinNumber,String legalBusinessName,String dbaName) throws InterruptedException {
		
		// TODO Auto-generated method stub
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(order));
		//Thread.sleep(8000);
	   // order.click() ;
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(add));
		//add.click();
		Thread.sleep(2000);
		i_name.sendKeys(name);
		mail.sendKeys(email);
		legal.sendKeys(streetAddress);
		i_city.sendKeys(city);
		Thread.sleep(4000);
		state.click();
		co.click();
		i_zip.sendKeys(zip);
		fien.sendKeys(feinNumber);
		business.sendKeys(legalBusinessName);
		dba.sendKeys(dbaName);
		submit.click();
		Thread.sleep(4000);
		String element = id.getAttribute("value");
        Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(2000);
		driver.get(element);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}

	
	
}