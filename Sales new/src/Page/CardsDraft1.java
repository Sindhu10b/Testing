package Page;

import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CardsDraft1 {
	 WebDriver driver;
	 
	 public CardsDraft1(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }

	 @FindBy(xpath="//div[contains(text(),'Order')]")
	 private WebElement order;
	 
	 @FindBy(xpath="(//span[@class='Orders__clientSub'])[1]")
	 private WebElement geha;
	 
	 @FindBy(xpath="//span[contains(text(),'Start')]")
	 private WebElement start_b;
	 
	@FindBy(xpath="//span[contains(text(),'Add Manually')]")
	//@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div[2]/div[1]/form/div/div[3]/div/button/div/div/span")
	 private WebElement add1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/button[1]/div[1]/div[1]/span[1]")
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
	 
	 @FindBy(xpath="//input[@name='employeeProcessTypeId'and @value='1']")
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
	 
	 @FindBy(xpath="//div[contains(text(),'Semi-Monthly')]")
	 private WebElement semi;
	 
	 @FindBy(xpath="//input[@name='employeeTypeId' and @value='1']")
	 private WebElement w2;
	 
	 @FindBy(xpath="//input[@name='employmentTypeId' and @value='1']")
	 private WebElement full1;
	 
	 @FindBy(xpath="//input[@name='payTypeId' and @value='1']")
	 private WebElement salary;
	 
	 @FindBy(xpath="//input[@name='standardHours']")
	 private WebElement stdhr;
	 
	 @FindBy(xpath="//input[@name='salary']")
	 private WebElement salary1;
	 
	 @FindBy(xpath="//input[@name='hourlyRate']")
	 private WebElement rate1;
	 
	 @FindBy(xpath="//input[@name='hourlyPayRate2']")
	 private WebElement rate2;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.description']")
	 private WebElement pto;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.hoursAllowed']")
	 private WebElement hoursallowed;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.hoursTaken']")
	 private WebElement houtstaken;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.hoursCarriedForward']")
	 private WebElement forward;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.accrualRate']")
	 private WebElement accrual;
	 
	 @FindBy(xpath="//div[contains(text(),'Default')]")
	 private WebElement type;
	 
	 @FindBy(xpath="//div[contains(text(),'Do not Accure')]")
	 private WebElement do_not;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.accrualPeriodId'][@value='1']")
	 private WebElement hiredate;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.maximumHoursEarnedOverrideId'][@value='1']")
	 private WebElement earned;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.maximumHoursEarned']")
	 private WebElement hours_earned ;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.maximumHoursCarriedOverOverrideId'][@value='1']")
	 private WebElement override_1;
	 
	 @FindBy(xpath="//input[@name='paidTimeOffBean.maximumHoursCarriedOver']")
	 private WebElement carried_over;
	
	 //@FindBy(xpath="")
	 //private WebElement ;
	
	 @FindBy(xpath="//span[contains(text(),'Next')]")//span[contains(text(),'Next')]
	 private WebElement next_1;
	 
	 @FindBy(xpath="//input[@name='federalNumberOfAllowance']")
	 private WebElement f_num;
	 
	 @FindBy(xpath="//input[@name='fedFlatAndRate']")
	 private WebElement f_flat;
	 
	 @FindBy(xpath="//input[@name='fedAdditionalDollarAmount']")
	 private WebElement dollar;
	 
	 @FindBy(xpath="//input[@name='fedFlatPercentageAmount']")
	 private WebElement f_per;
	 
	 @FindBy(xpath="//input[@name='fedAdditionalPercentageAmount']")
	 private WebElement f_add;
	 
	 @FindBy(xpath="//span[contains(text(),'Next')]")
	 private WebElement next_2;
	 
	 @FindBy(xpath="//input[@name='stateNumberOfAllowance']")
	 private WebElement s_num;
	 
	 @FindBy(xpath="//input[@name='stateFlatAndRate']")
	 private WebElement s_flat;
	 
	 @FindBy(xpath="//input[@name='stateUnemploymentInsuranceBean.isSitTaxExempt'][@value='1']")
	 private WebElement s_per;
	 
	 @FindBy(xpath="//input[@id='Health Insurance Eligibility Date']")
	 private WebElement health;
	 
	 @FindBy(xpath="//span[contains(text(),'22')]")
	 private WebElement date2;
	 
	 @FindBy(xpath="//span[contains(text(),'OK')]")
	 private WebElement ok1;
	 
	 @FindBy(xpath="//input[@name='localTaxBean.taxJurisdiction']")
	 private WebElement localtest;
	 
	 @FindBy(xpath="//input[@name='localTaxBean.overrideAmount']")
	 private WebElement localover;
	 
	 @FindBy(xpath="//span[contains(text(),'Next')]")
	 private WebElement next_3;
	  
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
	 
	 @FindBy(xpath="//input[@name='isHaveActiveGarnishments'][@value='1']")
     private WebElement active;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.lienDeductionCode']")
	 private WebElement code;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.payeeCity']")
	 private WebElement payee;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.lienDeductionDescription']")
	 private WebElement description;
	 
	 @FindBy(xpath="//div[contains(@class,'css-1wa3eu0-placeholder')]")
	 private WebElement state1;
	 
	 @FindBy(xpath="(//div[.='AL-Alabama'])[1]")
	 private WebElement al;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.caseId']")
	 private WebElement caseid;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.zipCode']")
	 private WebElement zip1;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.payeeName']")
	 private WebElement payeename;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.payeeContactName']")
	 private WebElement payeecontact;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.payeeAddress']")
	 private WebElement payeeaddress;
	 
	 @FindBy(xpath="//input[@name='garnishmentBean.payeeContactPhoneNumber']")
	 private WebElement payeenum;
	 
	 @FindBy(xpath="//span[.='Add']")
	 private WebElement add;
	 
	 @FindBy(xpath="//span[contains(text(),'Continue')]")
	 private WebElement cont_4;
	 
	 @FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
	 private WebElement payroll1;
		
	 @FindBy(xpath="//span[contains(text(),'Continue')]")
	 private WebElement cont_6;
	 
	 @FindBy(xpath="//span[contains(text(),'Finish')]")
	 private WebElement fin;
	 
	// @FindBy(xpath="//input[@id='refferal']")
	// private WebElement id;

	public void drafts(String first,String middle,String last,String h_email,String phone,
			 String homead,String h_city,String h_zip,String Socail,
			 String stdhr1,String salary_1,	String rate_1,String rate_2,String PTO,String allowed,
			 String taken,String carried ,String Accuralrate,String max_earned,String max_carried,
			 String fednum,String fedflat,String Dollar,String fedper,String fedadd,
	String statnum,String statflat,String Local_Juri,String local_Override,
	String bname,String broute,String bba,
    String liencode,String payeecity1,String liendesc,String CaseId,String Zipcode,
	String PayeeName,String PayeeContact,String PayeeAddress,String Payeenum) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
	     Thread.sleep(5000);
	/*	 order.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(geha));
		  element.click();
		  Thread.sleep(3000);
	      geha.click();
		 Thread.sleep(2000);
		 start_b.click();
		 Thread.sleep(4000);*/
		 Actions actions = new Actions(driver);
		 actions.moveToElement(add1).click().perform();
		Thread.sleep(5000);
	   //WebDriverWait wait1 = new WebDriverWait(driver,30);
      //WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(emp));
    // element.click();
	emp.click();
	Thread.sleep(500);
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
    Thread.sleep(1000);
    week_1.click();
    Thread.sleep(1000);
    semi.click();
    Thread.sleep(500);
    w2.click();
    Thread.sleep(500);
    full1.click();
    Thread.sleep(500);
    salary.click();
    Thread.sleep(500);
    stdhr.sendKeys(stdhr1);
    salary1.sendKeys(salary_1);
    rate1.sendKeys(rate_1);
    rate2.sendKeys(rate_2);
    pto.sendKeys(PTO);
    hoursallowed.sendKeys(allowed);
    houtstaken.sendKeys(taken);
    forward.sendKeys(carried);
    accrual.sendKeys(Accuralrate);
    type.click();
    Thread.sleep(500);
    do_not.click();
    Thread.sleep(500);
    hiredate.click();
    earned.click();
    Thread.sleep(500);
    hours_earned.sendKeys(max_earned);
    Thread.sleep(500);
    override_1.click();
    carried_over.sendKeys(max_carried);
    Thread.sleep(1000);
    next_1.click();
    Thread.sleep(2000);
    f_num.sendKeys(fednum);
    f_flat.sendKeys(fedflat);
    dollar.sendKeys(Dollar);
    f_per.sendKeys(fedper);
    f_add.sendKeys(fedadd);
    Thread.sleep(1000);
    next_2.click();
    Thread.sleep(2000);
    s_num.sendKeys(statnum);
    s_flat.sendKeys(statflat);
    Thread.sleep(500);
   s_per.click();
   Thread.sleep(500);
   health.click();
   Thread.sleep(500);
   date2.click();
   Thread.sleep(500);
   ok.click();
   Thread.sleep(400);
   localtest.sendKeys(Local_Juri);
   Thread.sleep(500);
   localover.sendKeys(local_Override);
   Thread.sleep(600);
    next_2.click();
    Thread.sleep(2000);
    emp_1.sendKeys(bname);
    rout.sendKeys(broute);
    ba.sendKeys(bba);
  //  check.click();
    full.click();
    active.click();
    code.sendKeys(liencode);
    payee.sendKeys(payeecity1);
    description.sendKeys(liendesc);
    Thread.sleep(1000);
    state1.click();
    Thread.sleep(600);
    al.click();
    Thread.sleep(200);
    caseid.sendKeys(CaseId);
    zip1.sendKeys(Zipcode);
    payeename.sendKeys(PayeeName);
    payeecontact.sendKeys(PayeeContact);
    payeeaddress.sendKeys(PayeeAddress);
    Thread.sleep(300);
    payeenum.sendKeys(Payeenum);
    Thread.sleep(1000);
	add.click();
	Thread.sleep(2000);
	cont_4.click();
	Thread.sleep(2000);
    payroll1.click();
	Thread.sleep(2000);
    Runtime.getRuntime().exec("F:\\File.exe");
    cont_6.click();
    Thread.sleep(1000);
    fin.click();
	/*String element1 = id.getAttribute("value");
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs1.get(1));
	Thread.sleep(4000);
	driver.get(element);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	driver.manage().window().maximize();*/
	}
		 
 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

