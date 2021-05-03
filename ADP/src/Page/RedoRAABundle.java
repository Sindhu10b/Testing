package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedoRAABundle {

	
	WebDriver driver;
	public RedoRAABundle(WebDriver driver) {
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
      
     @FindBy(xpath="(//input[@name='redoOption'])[2]")
     private WebElement RAA;
      
     @FindBy(xpath="//span[contains(text(),'Continue')]")
     private WebElement cont_1;
     
     @FindBy(xpath="//input[@name='configBean.w2Package' and @value='1']")
     private WebElement firm;
     
     @FindBy(xpath="//input[@name='configBean.clientOptionList' and @value='1']")
     private WebElement filer;
     
     @FindBy(xpath="//span[contains(text(),'Finish')]")
     private WebElement finish;

    public void redo() throws InterruptedException {
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
    Thread.sleep(2000);
    //firm.click();
    Thread.sleep(1000);
    filer.click();
    Thread.sleep(500);
    finish.click();  
}
}