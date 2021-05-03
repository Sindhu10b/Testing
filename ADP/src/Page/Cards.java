package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cards {
	
	WebDriver driver;
	
	public Cards(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	private WebElement c_pass;
	
	@FindBy(xpath="//span[contains(text(),'Update Password')]")
	private WebElement u_pass;
	 
	@FindBy(xpath="//span[contains(text(),'Login')]")
    private WebElement login;
	
	@FindBy(xpath="//span[contains(text(),'Review Information')]")
	private WebElement review;
	
	@FindBy(xpath="//div[contains(text(),'Prior payrolls in current Tax Year')]")
	private WebElement exist;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_1;
	
	@FindBy(xpath="//input[@name='clientInfoBean.title']")
	private WebElement title;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_2;
	
	@FindBy(xpath="(//input[@name='addressInfoBean.isDbaAddress'])[1]")
	private WebElement  value ;
	
	@FindBy(xpath="(//input[@name='addressInfoBean.isShippingAddress'])[1]")
	private WebElement ship;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement tab;
	
	@FindBy(xpath="//div[contains(text(),'PST')]")
	private WebElement pst;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_3;
	
	@FindBy(xpath="//input[@value='8']")
	private WebElement val;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_4;
	
	@FindBy(xpath="(//div[.='Monthly'])[1]")
	private WebElement mon;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_5;
	
	@FindBy(xpath="//input[@name='taxFilingBean.activeEmployees']")
	private WebElement active;
	
	@FindBy(xpath="//input[@name='taxFilingBean.terminatedEmployees']")
	private WebElement term;
	
	@FindBy(xpath="//input[@id='Choose a Date']")
	private WebElement date;
	
	@FindBy(xpath="//body/div/div/div/div/div/div/div/div/div/div/button/div/*[1]")
	private WebElement n;
	
	@FindBy(xpath="//span[.='6']")
	private WebElement date_num;
	
	@FindBy(xpath="//span[contains(text(),'OK')]")
	private WebElement ok_1;
	
	@FindBy(xpath="//*[@id=\"payPeriodInitialMonth\"]")
	private WebElement pay;
	
	@FindBy(xpath="//span[.='9']")
	private WebElement from_d;
	
	@FindBy(xpath="//span[contains(text(),'OK')]")
	private WebElement ok_2;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement terminal;
	
	@FindBy(xpath="//span[contains(text(),'22')]")
	private WebElement to_d;
	
	@FindBy(xpath="//span[contains(text(),'OK')]")
	private WebElement ok_3;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_6;
	
	@FindBy(xpath="//input[@name='bankInformationBean.bankRoutingNumber']")
	private WebElement b_routing;
	
	@FindBy(xpath="//input[@name='bankInformationBean.bankAccountDDA']")
	private WebElement b_acc;
	
	@FindBy(xpath="//input[@name='bankInformationBean.bankName']")
	private WebElement b_name;
	
	@FindBy(xpath="//input[@name='bankInformationBean.bankAddress']")
	private WebElement b_address;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont1;
	
	@FindBy(xpath="(//input[@value='1'])[1]")
	private WebElement payroll;
	
	//@FindBy(xpath="//div[contains(text(),'(Most Common)')]")
	//private WebElement most;
	
	@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
	private WebElement file_upload;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_7;
	
	@FindBy(xpath="//input[@name='federalTaxInfoBean.federalId']")
	private WebElement federal;
	
	@FindBy(xpath="//input[@name='federalTaxInfoBean.isSeasonalEmployer' and @value='1']")
	private WebElement seasonal;
	
	@FindBy(xpath="//input[@name='federalTaxInfoBean.isFutaExempt' and @value='2']")
	private WebElement futa;
	
	@FindBy(xpath="//input[@name='federalTaxInfoBean.isAnScorp' and @value='1']")
	private WebElement corp;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont2;
	
	@FindBy(xpath="(//div[.='Select state'])[1]")
	private WebElement states;
	
	@FindBy(xpath = "(//div[.='GA-Georgia'])[1]")
	private WebElement ga;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].stateIncomeTaxId']")
	private WebElement state_tax;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].stateUEId']")
	private WebElement state_id;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].suiRate']")
	private WebElement rate;
	
	@FindBy(xpath="(//input[@name='stateTaxInfoBean[0].isSuiExempt'])[1]")
	private WebElement exempt;
	
	
	@FindBy(xpath="//span[contains(text(),'Add Local ID')]")
	private WebElement local;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].firstCity']")
	private WebElement cityl;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].localId']")
	private WebElement idl;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].localPsd']")
	private WebElement psdl;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].local4DigitId']")
	private WebElement digitl;
	
	@FindBy(xpath="//div//div//div[3]//div[1]//div[1]//div[1]//input[1]")
	private WebElement exempt1;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].isLocalAppliedFor'][@value='1']")
	private WebElement forl;
	
	@FindBy(xpath="//input[@name='stateTaxInfoBean[0].localTaxTypeId'][@value='2']")
	private WebElement type;
			
	@FindBy(xpath="//span[.='Add']")
	private WebElement add;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_8;
	
    @FindBy(xpath="//span[contains(text(),\"I'll Upload\")]")
	private WebElement ill;
	
	@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
	private WebElement emp_f;
	
	//@FindBy(xpath="//span[contains(text(),'Back')]")
	//private WebElement back;

	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_9;
	
	@FindBy(xpath="//span[contains(text(),'Upload Now')]")
	private WebElement now;
	
	@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
	private WebElement filep;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement cont_10;
	
	@FindBy(xpath="//span[contains(text(),\"I'll Do It Later\")]")
	private WebElement later;

	public void cards(String password, String c_password, String tittle1,String numb, String terminated, String routing,
			String account, String name, String address, String federal_id, String state1, String s_tax, String suid,
			String Rate,String l_city,String l_id,String l_psd,String l_digit) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		pass.sendKeys(password);
	   // c_pass.sendKeys(c_password);
	   // u_pass.click();
		Thread.sleep(1000);
		login.click();
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		review.click();
		Thread.sleep(2000);
	    exist.click();
		cont_1.click();
		Thread.sleep(2000);
		title.sendKeys(tittle1);
		cont_2.click();
		value.click();
		Thread.sleep(500);
		ship.click();
		Thread.sleep(500);
		tab.click();
		Thread.sleep(1000);
		pst.click();
		Thread.sleep(500);
		cont_3.click();
		Thread.sleep(1000);
		val.click();
		cont_4.click();
		Thread.sleep(500);
		mon.click();
		Thread.sleep(1000);
		cont_5.click();
		active.sendKeys(numb);
		term.sendKeys(terminated);
		Thread.sleep(1000);
		Thread.sleep(500);
		date.click();
		n.click();
		Thread.sleep(500);
		date_num.click();
		ok_1.click();
		Thread.sleep(1000);
		pay.click();
		Thread.sleep(500);
		from_d.click();
		ok_2.click();
		Thread.sleep(500);
		terminal.click();
		Thread.sleep(1000);
		to_d.click();
		Thread.sleep(1000);
		ok_3.click();
		Thread.sleep(1000);
		cont_2.click();
	   Thread.sleep(2000);
	   b_routing.sendKeys(routing);
	   b_acc.sendKeys(account);
	   b_name.sendKeys(name);
	   Thread.sleep(1000);
	   b_address.sendKeys(address);
	   payroll.click();
	   Thread.sleep(1000);
	   cont1.click();
	   Thread.sleep(4000);
	   file_upload.click();
	   Thread.sleep(2000);
	   Runtime.getRuntime().exec("F:\\File.exe");
	   Thread.sleep(4000);
	   cont_4.click();
	   Thread.sleep(1000);
	   federal.sendKeys(federal_id);
	   seasonal.click();
	   futa.click();
	   corp.click();
	   Thread.sleep(1000);
	   cont2.click();
	   Thread.sleep(3000);
	   states.click();
	   Thread.sleep(2000);
	   ga.click();
	   Thread.sleep(1000);
	   //state.sendKeys(state1);
	   state_tax.sendKeys(s_tax);
	   Thread.sleep(1000);
	   state_id.sendKeys(suid);
	   Thread.sleep(500);
	   rate.sendKeys(Rate);
	   exempt.click();
	   local.click();
	   Thread.sleep(1000);
	   cityl.sendKeys(l_city);
	   Thread.sleep(300);
	   idl.sendKeys(l_id);
	   psdl.sendKeys(l_psd);
	   digitl.sendKeys(l_digit);
	   exempt1.click();
	   forl.click();
	   type.click();
	   add.click();
	   Thread.sleep(500);
	   cont_8.click();
	   Thread.sleep(2000);
	   ill.click();
	   emp_f.click();
	   Thread.sleep(2000);
	   Runtime.getRuntime().exec("F:\\File.exe");
	   Thread.sleep(4000);
	   cont_9.click();
	   Thread.sleep(1000);
	   now.click();
	   filep.click();
	   Thread.sleep(2000);
	   Runtime.getRuntime().exec("F:\\File.exe");
	   Thread.sleep(1000);
	   cont_10.click();
	   later.click();
	   //back.click();
	   
	}	
		
	}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


