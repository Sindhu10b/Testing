package Page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Inviteemp {
	WebDriver driver;                             
		
		public  Inviteemp(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//span[contains(text(),'Add Manually')]")
	//@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div[2]/div[1]/form/div/div[3]/div/button/div/div/span")
	private WebElement add1;
	
	@FindBy(xpath="//span[contains(text(),'Add Employee')]")
	//@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div[2]/div[1]/form/div/div[3]/div/button/div/div/span")
	private WebElement emp;
	 
 @FindBy(xpath="//input[@name='firstName']")
 private WebElement fn;
 
 @FindBy(xpath="//input[@name='middleName']")
 private WebElement mid;
 
 @FindBy(xpath="//input[@name='lastName']")
 private WebElement  lnm;
 
 @FindBy(xpath="//input[@name='genderId'][@value='2']")
 private WebElement val2;
 
 @FindBy(xpath="//input[@id='Date Of Birth']")
 private WebElement dd; 
 @FindBy(xpath="//span[contains(text(),'20')]")
 private WebElement e20; 
 @FindBy(xpath="//div[@class='year']")
 private WebElement year; 
 @FindBy(xpath="//span[contains(text(),'1982')]")
 private WebElement eyear;
 @FindBy(xpath="//span[contains(text(),'OK')]")
 private WebElement ok;
 
 @FindBy(xpath="//input[@name='email']")
 private WebElement email;
 
 @FindBy(xpath="//input[@name='phoneNumber']")
 private WebElement ph;
 
 @FindBy(xpath="//input[@name='homeAddressBean.streetAddress']")
 private WebElement hme;
 
 @FindBy(xpath="//input[@name='homeAddressBean.city']")
 private WebElement city;
  
 @FindBy(xpath="(//div[.='Select state'])[1]")
 private WebElement state;
	
 @FindBy(xpath = "(//div[.='GA-Georgia'])[1]")
 private WebElement ga;
 
 @FindBy(xpath="//input[@name='homeAddressBean.zip']")
 private WebElement zip;
 
 @FindBy(xpath="//input[@name='typesOfIdsModel.id'][@value='1']")
 private WebElement ss;
 @FindBy(xpath="//input[@name='socialSecurityNumber']")
 private WebElement ssn;
 
 @FindBy(xpath="//span[contains(text(),'Next')]")
 private WebElement next;
 
 @FindBy(xpath="//input[@id='Date Of Hire']")
 private WebElement hire;

 @FindBy(xpath="//span[contains(text(),'OK')]")
 private WebElement Ok_1;
 
 @FindBy(xpath="//div[contains(text(),'Weekly')]")
 private WebElement week_1;
 
 @FindBy(xpath="(//div[.='Monthly'])[1]")
 private WebElement mon;
 
 @FindBy(xpath="//span[contains(text(),'Next')]")//span[contains(text(),'Next')]
 private WebElement next_1;
 
 @FindBy(xpath="//input[@name='federalNumberOfAllowance']")
 private WebElement f_num;
 
 @FindBy(xpath="//input[@name='fedFlatAndRate']")
 private WebElement f_flat;
 
 @FindBy(xpath="//input[@name='fedAdditionalPercentageAmount']")
 private WebElement f_per;
 
 @FindBy(xpath="//span[contains(text(),'Next')]")
 private WebElement next_2;
 
 @FindBy(xpath="//input[@name='stateNumberOfAllowance']")
 private WebElement s_num;
 
 @FindBy(xpath="//input[@name='stateFlatAndRate']")
 private WebElement s_flat;
 
 @FindBy(xpath="//input[@name='stateAdditionalPercentageAmount']")
 private WebElement s_per;
 
 @FindBy(xpath="//input[@name='employeeBankName']")
 private WebElement emp_1;
 
 @FindBy(xpath="//input[@name='bankRouting']")
 private WebElement rout;
 
 @FindBy(xpath="//input[@name='bankAccount']")
 private WebElement ba;
 
 @FindBy(xpath="//input[@name='accountTypeId'][@value='1']")
 private WebElement check;
 
 @FindBy(xpath="//input[@name='isFullAmount'][@value='full amount']")
 private WebElement full;
 
 @FindBy(xpath="//span[.='Add']")
 private WebElement add;
 
 @FindBy(xpath="//span[contains(text(),'Continue')]")
 private WebElement cont_4;

 @FindBy(xpath="//span[contains(text(),'Upload Now')]")
 private WebElement pay;

 @FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
private WebElement file_upload;
 
 @FindBy(xpath="//span[contains(text(),'Continue')]")
 private WebElement cont_5;
 
 @FindBy(xpath="//span[contains(text(),\"I'll Do It Later\")]")
private WebElement later;
 
 @FindBy(xpath="//input[@id='refferal']")
 private WebElement id;
 
public void emp(String first,String middle,String last,String h_email,String phone,
		 String homead,String h_city,String h_zip,String Socail,
		 String fednum,String fedflat,String fedper,String statnum,String statflat,String statper,
		 String bname,String broute,String bba) throws InterruptedException, IOException {
	   Thread.sleep(4000);
	   //Actions actions = new Actions(driver);
	   //actions.moveToElement(add1).click().perform();
		add1.click();
		Thread.sleep(4000);
		//Actions actions1 = new Actions(driver);
		//actions1.moveToElement(emp).click().perform();
		emp.click();
		Thread.sleep(4000);
		fn.click();
		fn.sendKeys(first);
		mid.sendKeys(middle);
		lnm.sendKeys(last);
		Thread.sleep(1000);
		val2.click();
		Thread.sleep(500);
		dd.click();
		Thread.sleep(500);
		e20.click();
		Thread.sleep(500);
		year.click();
		Thread.sleep(1000);
		eyear.click();
		ok.click();
		email.sendKeys(h_email);
		ph.sendKeys(phone);
		hme.sendKeys(homead);
		city.sendKeys(h_city);
		Thread.sleep(3000);
		state.click();
		Thread.sleep(1000);
		ga.click();
		zip.sendKeys(h_zip);
		ss.click();
		ssn.sendKeys(Socail);
		next.click();
		hire.click();
		Thread.sleep(2000);
		Ok_1.click();
		Thread.sleep(2000);
		week_1.click();
		Thread.sleep(2000);
		mon.click();
		Thread.sleep(2000);
		next_1.click();
		Thread.sleep(2000);
		f_num.sendKeys(fednum);
		f_flat.sendKeys(fedflat);
		f_per.sendKeys(fedper);
		next_2.click();
		Thread.sleep(2000);
		s_num.sendKeys(statnum);
		s_flat.sendKeys(statflat);
		s_per.sendKeys(statper);
		next_2.click();
		Thread.sleep(2000);
		emp_1.sendKeys(bname);
		rout.sendKeys(broute);
		ba.sendKeys(bba);
		check.click();
		full.click();
		add.click();
		Thread.sleep(2000);
		cont_4.click();
		Thread.sleep(5000);
		pay.click();
		Thread.sleep(2000);
		file_upload.click();
		Thread.sleep(3000);
		
	    Runtime.getRuntime().exec("F:\\File.exe");
	    Thread.sleep(4000);
		cont_5.click();
		Thread.sleep(1000);
		later.click();
		Thread.sleep(2000);
		String element = id.getAttribute("value");
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(4000);
		driver.get(element);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		}
		 }	 
		
