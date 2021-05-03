package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S_Wizards 
	{
       WebDriver driver;
       public S_Wizards(WebDriver driver) 
       {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	   }

	@FindBy(xpath="//span[contains(text(),'Yes, I am')]")
	private WebElement  yes;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement  next;
	
	@FindBy(xpath="//input[@name='firmPayroll.title']")
	private WebElement title;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next1;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next2;
	
	@FindBy(xpath="//span[contains(text(),'Sign Agreement')]")
	private WebElement sign;
	
	@FindBy(xpath="//input[@name='brandingBean.firmLogoPath']")
	private WebElement logo;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next3;
	
	/*@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
	
	@FindBy(xpath="")
	private WebElement ;
	*/
	public void s_wizards(String text) throws InterruptedException {
		// TODO Auto-generated method stub
	    Thread.sleep(5000);
	    Actions actions = new Actions(driver);
		actions.moveToElement(yes).click();
		yes.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		title.sendKeys(text);
		Thread.sleep(1000);
		next1.click();
		Thread.sleep(5000);
		next2.click();
		Thread.sleep(3000);
		sign.click();
		next3.click();
		
		
	}

}
