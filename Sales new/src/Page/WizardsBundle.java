package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WizardsBundle
	
	{
	       WebDriver driver;
	       public WizardsBundle(WebDriver driver) 
	       {
				this.driver = driver;
				PageFactory.initElements(driver, this);
		   }

	    @FindBy(xpath="//span[contains(text(),'Yes, I am')]")
	   	private WebElement  yes;
	       
	    @FindBy(xpath="//span[contains(text(),'Next')]")   
	    private WebElement next;
	    
	    @FindBy(xpath="//span[contains(text(),'Add New')]")
	    private WebElement add;
	    
	    @FindBy(xpath="//input[@name='usersBean[0].name']")
	    private WebElement name;

	    @FindBy(xpath="//input[@name='usersBean[0].email']")
	    private WebElement email ;
	
	    @FindBy(xpath="//span[contains(text(),'Next')]")
	    private WebElement next1;
	
	
	    @FindBy(xpath="//input[@name='configBean.taxFilingOption'][@value='1']")
	    private WebElement tax;
	    
	    @FindBy(xpath="//input[@name='configBean.clientOptionId'][@value='client check: client will be debited as payroll checks are cashed']")
	    private WebElement client;
	    
	    @FindBy(xpath="//input[@name='configBean.paymentDeliverOptionList'][@value='3']")
	    private WebElement payment;
	    
	    @FindBy(xpath="//input[@name='configBean.is24HoursDirectDeposit'][@value='1']")
	    private WebElement hours;
	    
	    @FindBy(xpath="//input[@name='configBean.w2Package'][@value='1']")
	    private WebElement w2;
	    
	    @FindBy(xpath="(//input[@type='checkbox'])[1]")
	    private WebElement check;
	    
	    @FindBy(xpath="//input[@name='configBean.clientOptionList'][@value='1']")
	    private WebElement filer;
	    
	    @FindBy(xpath="//span[contains(text(),'Next')]")
	    private WebElement next2;
	
	    @FindBy(xpath="//span[contains(text(),'Go to Dashboard')]")
	    private WebElement dash;
	
	    public void wizards(String name1,String email1) throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(4000);
			yes.click();
	    	next.click();
	    	add.click();
	    	name.sendKeys(name1);
	        email.sendKeys(email1);
	        next1.click();
	        Thread.sleep(1000);
	        tax.click();
	        Thread.sleep(1000);
	        client.click();
	        payment.click();
	        Thread.sleep(1000);
	        hours.click();
	        w2.click();
	        check.click();
	        Thread.sleep(1000);
	        filer.click();
	        Thread.sleep(1000);
	        next2.click();
	        Thread.sleep(1000);
	        dash.click();
	                   
		}
     	
	}
