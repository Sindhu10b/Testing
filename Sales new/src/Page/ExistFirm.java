package Page;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistFirm {
	
	WebDriver driver;

	public ExistFirm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
       }
	
	@FindBy(xpath="//div[contains(text(),'Firms')]")
	private WebElement firm;
	
	@FindBy(xpath="//span[contains(text(),'Invite New')]")
	private WebElement invite;
	
	@FindBy(xpath="//div[contains(text(),'Invite an existing firm to Otto')]")
	private WebElement existing;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='streetAddress']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//div[contains(text(),'Select state')]")
	private WebElement state;
	
	@FindBy(xpath = "(//div[.='CO-Colorado'])[1]")
	private WebElement co;

	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement post;

	@FindBy(xpath = "//input[@name='firmName']")
	private WebElement fname;

	@FindBy(xpath = "//input[@name='cpaFirmSubDomain']")
	private WebElement sub;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	private WebElement phnum;

	@FindBy(xpath = "//input[@name='firmIid']")
	private WebElement fid;
	
	//@FindBy(xpath="//span[contains(text(),'Send Invite')]")
	//private WebElement send;
	
	@FindBy(xpath="//span[contains(text(),'Generate Link')]")
	private WebElement gener;
	
	@FindBy(xpath = "//input[@id='refferal']")
	private WebElement id;
	
	/*@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
*/
	public void exist(String name_1, String email_1, String street_1, String city_1,String postal,
			String firname, String domain, String phone,String fein) throws InterruptedException
	{
	Thread.sleep(3000);
	firm.click();
	Thread.sleep(8000);
	invite.click();
	Thread.sleep(3000);
    existing.click();
	name.sendKeys(name_1);
	email.sendKeys(email_1);
	street.sendKeys(street_1);
	city.sendKeys(city_1);
	state.click();
	Thread.sleep(1000);
	co.click();
	post.sendKeys(postal);
	fname.sendKeys(firname);
	sub.sendKeys(domain);
	phnum.sendKeys(phone);
	fid.sendKeys(fein);
	Thread.sleep(1000);
	//send.click();
	gener.click();
	Thread.sleep(2000);
	String element = id.getAttribute("value");
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs1.get(1));
	Thread.sleep(2000);
	driver.get(element);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
	driver.manage().window().maximize();
	
	
}

}
