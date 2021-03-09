package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoGlobal {
	
	WebDriver driver;

	    public PromoGlobal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
       }
	
	@FindBy(xpath="//div[contains(text(),'Promos')]")
	private WebElement promo ;
	
	@FindBy(xpath="//span[contains(text(),'Add New')]")
	private WebElement add;
	
	@FindBy(xpath="//input[@name='promoTitle']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='promoCode']")
	private WebElement code;
	
	@FindBy(xpath="//input[@name='discount']")
	private WebElement discount;
	
	@FindBy(xpath="//input[@id='Start Date *']")
	private WebElement start;
	
	@FindBy(xpath="//span[contains(text(),'30')]")
	private WebElement date;
	
	@FindBy(xpath="//span[contains(text(),'OK')]")
	private WebElement ok;
	
	@FindBy(xpath="//input[@id='End Date *']")
	private WebElement end;
	
	@FindBy(xpath="//body/div/div/div/div/div/div/div/div/div/div/button/div/*[1]")
	private WebElement next ;
	
	@FindBy(xpath="//span[contains(text(),'29')]")
	private WebElement date1;
	
	@FindBy(xpath="//span[contains(text(),'OK')]")
	private WebElement ok_1;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement desc ;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	private WebElement save;
	 
    public void promo(String PTittle,String PCode,String PDiscount,String PDescription) throws InterruptedException {
    	Thread.sleep(2000);
    	promo.click();
    	Thread.sleep(5000);
    	add.click();
    	Thread.sleep(2000);
    	title.sendKeys(PTittle);
    	Thread.sleep(4000);
    	code.sendKeys(PCode);
    	Thread.sleep(2000);
    	discount.sendKeys(PDiscount);
    	Thread.sleep(2000);
    	start.click();
    	Thread.sleep(500);
    	date.click();
    	ok.click();
    	Thread.sleep(500);
    	end.click();
    	next.click();
    	Thread.sleep(500);
    	date1.click();
    	ok_1.click();
    	Thread.sleep(1000);
    	desc.sendKeys(PDescription);
    	save.click();
    	 }
}
