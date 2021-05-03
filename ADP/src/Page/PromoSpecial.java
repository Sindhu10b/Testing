package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromoSpecial {

	WebDriver driver;

    public PromoSpecial(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
   }

@FindBy(xpath="//div[contains(text(),'Promos')]")
private WebElement promo ;

@FindBy(xpath="//div[contains(text(),'Special Discounts')]")
private WebElement spec;

@FindBy(xpath="//span[contains(text(),'Add New')]")
private WebElement add;

@FindBy(xpath="//input[@name='firmName']")
private WebElement fname;

@FindBy(xpath="//input[@name='salesRepName']")
private WebElement srep;

@FindBy(xpath="//input[@name='salesRepTitle']")
private WebElement stitle;

@FindBy(xpath="//input[@name='salesRepRegion']")
private WebElement sregion;

@FindBy(xpath="//input[@name='approvedBy']")
private WebElement by;

@FindBy(xpath="//input[@name='discountCode']")
private WebElement dc;

@FindBy(xpath="//input[@name='percentage']")
private WebElement per;

@FindBy(xpath="//input[@name='amount']")
private WebElement amount;

@FindBy(xpath="//textarea[@name='additionalNotes']")
private WebElement notes;

@FindBy(xpath="//input[@id='Expiry Date *']")
private WebElement mm;

@FindBy(xpath="//body/div/div/div/div/div/div/div/div/div/div/button/div/*[1]")
private WebElement next;

@FindBy(xpath="//span[contains(text(),'30')]")
private WebElement end;

@FindBy(xpath="//span[contains(text(),'OK')]")
private WebElement ok;

@FindBy(xpath="//span[contains(text(),'Save')]")
private WebElement save;


public void special(String fname_1,String srep_1,String tittle,String region,String by_1,String dc_1,
	String per_1,String amount_1,String notes_1) throws InterruptedException {
    Thread.sleep(2000);
	promo.click();
	Thread.sleep(2000);
	spec.click();
	Thread.sleep(2000);
	add.click();
	Thread.sleep(3000);
	fname.sendKeys(fname_1);
	Thread.sleep(500);
	srep.sendKeys(srep_1);
	stitle.sendKeys(tittle);
	sregion.sendKeys(region);
	by.sendKeys(by_1);
    dc.sendKeys(dc_1);
    Thread.sleep(2000);
    per.sendKeys(per_1);
    Thread.sleep(1000);
    amount.sendKeys(amount_1);
    Thread.sleep(500);
    notes.sendKeys(notes_1);
    Thread.sleep(4000);
    mm.click();
    next.click();
    Thread.sleep(500);
    end.click();
    ok.click(); 
    Thread.sleep(500);
    save.click();
	}

}


