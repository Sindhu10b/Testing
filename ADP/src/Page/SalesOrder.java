package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrder {
	

	WebDriver driver;
	public SalesOrder(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(xpath="//div[contains(text(),'Process Orders')]")
	private WebElement process;

	@FindBy(xpath="//div[contains(text(),'Drafts')]")
	private WebElement draft;

	@FindBy(xpath="//div[contains(text(),'All Firms')]")
	private WebElement all;

	@FindBy(xpath="//div[contains(text(),'foje')]")
	private WebElement foje;
	
	@FindBy(xpath="//span[contains(text(),'Create Order')]")
	private WebElement create;

	@FindBy(xpath="//input[@name='name']")
	private WebElement name;

	@FindBy(xpath="//input[@name='email']")
	private WebElement email;

	@FindBy(xpath="//input[@name='streetAddress']")
	private WebElement address;

	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="(//div[.='Select state'])[1]")
	private WebElement state;
	
	@FindBy(xpath = "(//div[.='GA-Georgia'])[1]")
	private WebElement ga;
	
	
	@FindBy(xpath="//input[@name='zip']")
	private WebElement zip;
	
	@FindBy(xpath="//span[.='Create']")
	private WebElement cre1;

	
	public void orders(String name1,String email1,String adre,String city1,String zip1) throws InterruptedException {
	Thread.sleep(2000);
	process.click();
	draft.click();
	all.click();
	Thread.sleep(1000);
	foje.click();
	create.click();
	Thread.sleep(2000);
	name.sendKeys(name1);
	email.sendKeys(email1);
	address.sendKeys(adre);
	city.sendKeys(city1);
	Thread.sleep(3000);
	state.click();
	Thread.sleep(1000);
	ga.click();
	zip.sendKeys(zip1);

}
}
	