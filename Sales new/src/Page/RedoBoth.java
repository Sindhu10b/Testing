package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedoBoth {

	WebDriver driver;
	public RedoBoth(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Order')]")
    private WebElement order;
    
    @FindBy(xpath="//div[contains(text(),'Submitted to ADP')]")
    private WebElement submitted;
    
    @FindBy(xpath="//table[@class='Orders__ordersTable']//tbody//tr//td//div//button")
    private WebElement menu ;
	
    @FindBy(xpath="//div[contains(text(),'Redo')]")
    private WebElement text;
     
    @FindBy(xpath="(//input[@name='redoOption'])[3]")
    private WebElement RAA;
    
    @FindBy(xpath="//span[contains(text(),'Continue')]")
    private WebElement cont_1;
    
    @FindBy(xpath="//div[contains(text(),'No prior payrolls in current Tax Year')]")
    private WebElement newprior;
    
    /*@FindBy(xpath="//div[contains(text(),'PST')]")
    private WebElement pst;
    */
    @FindBy(xpath="//span[contains(text(),'Continue')]")
    private WebElement cont_2;
    
    @FindBy(xpath="//input[@type='checkbox'][@value='7']")
    private WebElement gar;
    
    @FindBy(xpath="//input[@id='Choose a Date']")
	 private WebElement date;
		
	 @FindBy(xpath="//body/div/div/div/div/div/div/div/div/div/div/button[2]/div[1]/*[1]")
	 private WebElement n;
			
	 @FindBy(xpath="//span[.='18']")
	 private WebElement date_num;
		
	 @FindBy(xpath="//span[contains(text(),'OK')]")
	 private WebElement ok_1;
    
	 @FindBy(xpath="//span[contains(text(),'Continue')]")
    private WebElement cont_3;
    
    
    @FindBy(xpath="//span[contains(text(),'Continue')]")
    private WebElement cont_4;
    
    @FindBy(xpath="//span[contains(text(),'Finish')]")
    private WebElement finish;
    
  /*  
    @FindBy(xpath="")
    private WebElement ;
    
    @FindBy(xpath="")
    private WebElement ;
*/
   public void redoboth() throws InterruptedException {
	Thread.sleep(4000);
	order.click();
	Thread.sleep(1000);
   submitted.click();
   Thread.sleep(2000);
   menu.click();
   Thread.sleep(500);
   text.click();
   Thread.sleep(1000);
   RAA.click();
   Thread.sleep(500);
   cont_1.click();
   //Thread.sleep(2000);
   Thread.sleep(6000);
   Actions actions1 = new Actions(driver);
   actions1.moveToElement(newprior).click().perform();
   newprior.click();
   //Thread.sleep(1000);
   //pst.click();
   Thread.sleep(1000);
   cont_2.click();
   Thread.sleep(1000);
   gar.click();
   Thread.sleep(1000);
   date.click();
   Thread.sleep(500);
   n.click();
   Thread.sleep(500);
   date_num.click();
   ok_1.click();
   Thread.sleep(500);
   cont_3.click();  
   Thread.sleep(1000); 
   cont_4.click();
   Thread.sleep(500);
   finish.click(); 
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
