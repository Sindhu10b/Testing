package Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firm {

	WebDriver driver;

	public Firm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[contains(text(),'Firms')]")
	private WebElement firm;

	@FindBy(xpath = "//span[contains(text(),'Invite New')]")
	private WebElement invite;

	@FindBy(xpath = "//div[contains(text(),'New')]")
	private WebElement new1;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='streetAddress']")
	private WebElement street;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;

	@FindBy(xpath = "(//div[.='Select state'])[1]")
	private WebElement state;

	@FindBy(xpath = "(//div[.='CO-Colorado'])[1]")
	private WebElement co;

	@FindBy(xpath = "//input[@name='county']")
	private WebElement county;

	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement post;

	@FindBy(xpath = "//input[@name='firmName']")
	private WebElement fname;

	@FindBy(xpath = "//input[@name='cpaFirmSubDomain']")
	private WebElement sub;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	private WebElement phnum;

	@FindBy(xpath = "//input[@name='firmFein']")
	private WebElement fein;

	@FindBy(xpath = "//input[@name='beneficiary1']")
	private WebElement bene1;

	@FindBy(xpath = "//input[@name='beneficiary2']")
	private WebElement bene2;

	@FindBy(xpath = "//input[@name='beneficiary3']")
	private WebElement bene3;

	@FindBy(xpath = "(//input[@name='setupResponsibility'])[1]")
	private WebElement set;

	@FindBy(xpath = "//div[contains(text(),'Browse or Drag & drop file here')]")
	private WebElement file;

	@FindBy(xpath = "//input[@name='numberOfPayrollClients']")
	private WebElement npay;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement month;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]/div[1]/span[1]")
	private WebElement ok;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	private WebElement button;

	@FindBy(xpath = "//div[contains(text(),'COPDE')]")
	private WebElement pro;

	@FindBy(xpath="//div[contains(text(),'Click to add SA')]")
	private WebElement fbutton;
	
	@FindBy(xpath = "//input[@name='split']")
	private WebElement split;    

	@FindBy(xpath="//span[contains(text(),'Add')]")
	private WebElement add;
	
	@FindBy(xpath="//span[contains(text(),'Generate Link')]")
	private WebElement link;
	
	@FindBy(xpath = "//input[@id='refferal']")
	private WebElement id;

	public void firm(String name_1, String email_1, String street_1, String city_1, String county_1, String postal,
			String firname, String domain, String phone, String Fein, String ben1, String ben2, String ben3,
			String payment,String splits)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		firm.click();
		Thread.sleep(8000);
		invite.click();
		Thread.sleep(3000);
		new1.click();
		name.sendKeys(name_1);
		email.sendKeys(email_1);
		street.sendKeys(street_1);
		city.sendKeys(city_1);
		state.click();
		Thread.sleep(1000);
		co.click();
		county.sendKeys(county_1);
		post.sendKeys(postal);
		fname.sendKeys(firname);
		sub.sendKeys(domain);
		phnum.sendKeys(phone);
		fein.sendKeys(Fein);
		bene1.sendKeys(ben1);
		bene2.sendKeys(ben2);
		bene3.sendKeys(ben3);
		set.click();
		Thread.sleep(2000);
		file.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("F:\\File.exe");
		Thread.sleep(4000);
		npay.sendKeys(payment);
		Thread.sleep(3000);
		/*Actions actions = new Actions(driver);
		actions.moveToElement(month).click();*/
		month.click();
		
		Thread.sleep(2000);
		ok.click();
		Thread.sleep(2000);
		button.click();
		Thread.sleep(3000);
		pro.click();
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(fbutton).click();
		//fbutton.click();
        Thread.sleep(2000);
		split.sendKeys(splits);
		Thread.sleep(1000);
		add.click();
		link.click();
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
