package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DraftReg {	
		WebDriver driver;
		
		     public DraftReg(WebDriver driver)
		 {
			 this.driver=driver;
			 PageFactory.initElements(driver,this);
		 }
		
		   //@FindBy(xpath="//div[contains(text(),'OttoMart')]")
		  //private WebElement otto;

		 @FindBy(xpath="//div[.='Order'][1]")
		 private WebElement client;

		 @FindBy(xpath="//span[contains(text(),'Create Order')]")
		 private WebElement create;
		 
		 @FindBy(xpath="(//input[@name='name'])[1]")
		 private WebElement name_1;
		 
		 @FindBy(xpath="(//input[@name='email'])[1]")
		 private WebElement email_1;
		 
		 @FindBy(xpath="(//input[@name='phoneNumber'])[1]")
		 private WebElement phone_1;
		 
		 @FindBy(xpath="(//input[@name='legalAddressBean.streetAddress'])[1]")
		 private WebElement legal_1;
		 
		 @FindBy(xpath="(//input[@name='legalAddressBean.city'])[1]")
		 private WebElement city_1;
		 
		 @FindBy(xpath = "//div[contains(text(),'Select state')]")
		 private WebElement state;

		 @FindBy(xpath = "(//div[.='CO-Colorado'])[1]")
		 private WebElement co;
		 
		 @FindBy(xpath="(//input[@name='legalAddressBean.zip'])[1]")
		 private WebElement zip_1;
		 
		 @FindBy(xpath="(//input[@name='feinNumber'])[1]")
		 private WebElement fein_1;
		 
		 @FindBy(xpath="(//input[@name='legalBusinessName'])[1]")
		 private WebElement busin;
		 
		 @FindBy(xpath="(//input[@name='dbaName'])[1]")
		 private WebElement dba;
		 
		 @FindBy(xpath="//span[.='Create']")
		 private WebElement cret;

		// @FindBy(xpath="//span[contains(text(),'Start')]")
		// private WebElement start_b;
		  
		 public void draft(String name,String email,String phone,String legal,String city,
		 String zip,String fein,String business,String dbaname) throws InterruptedException {
//	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			Thread.sleep(4000);
	    Actions actions = new Actions(driver);
		actions.moveToElement(client).click();
		client.click();
		Thread.sleep(2000);
		create.click();
		name_1.sendKeys(name);
		email_1.sendKeys(email);
		phone_1.sendKeys(phone);
		legal_1.sendKeys(legal);
		city_1.sendKeys(city);
		Thread.sleep(2000);
		//Actions actions = new Actions(driver);
		//actions.moveToElement(state).click();
		state.click();
		//Thread.sleep(3000);
		co.click();
		zip_1.sendKeys(zip);
		Thread.sleep(1000);
		fein_1.sendKeys(fein);
		busin.sendKeys(business);
		Thread.sleep(1000);
		dba.sendKeys(dbaname);
		Thread.sleep(3000);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(cret).click();
		cret.click(); 
		Thread.sleep(3000);
	   //start_b.click();
		
	 }
}
	
	
