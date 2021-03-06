    package Page;
	import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CardsDraft {
		
		WebDriver driver;
		
		public CardsDraft(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//div[contains(text(),'Order')]")
		private WebElement order;
		
	/*	@FindBy(xpath="(//span[@class='Orders__clientSub'])[1]")
				//span[@class='Ordrs__clientName']")
		private WebElement geha;
		*/
		 @FindBy(xpath="//span[contains(text(),'Start')]")
		 private WebElement start_b;
		 
		 @FindBy(xpath="//input[@name='clientInfoBean.title']")
		 private WebElement title;
	   
		@FindBy(xpath="//div[contains(text(),'No prior payrolls in current Tax Year')]")
		private WebElement new_1;
		
		@FindBy(xpath="//div[contains(text(),'Prior payrolls in current Tax Year')]")
		private WebElement exist;
		
		@FindBy(xpath="(//input[@name='addressInfoBean.isDbaAddress'])[1]")
		private WebElement dba;
		
		@FindBy(xpath="(//input[@name='addressInfoBean.isShippingAddress'])[1]")
		private WebElement shipping;
		
		@FindBy(xpath="(//button[@type='button'])[1]")
		private WebElement tab;
		
		@FindBy(xpath="//div[contains(text(),'PST')]")
		private WebElement pst;
		
		@FindBy(xpath="//span[contains(text(),'Continue')]")
		private WebElement conti;
		
		@FindBy(xpath="//input[@value='8']")
		private WebElement general;
		
		@FindBy(xpath="//div[text()='Monthly']")
		private WebElement mon;
		
		@FindBy(xpath="//input[@name='taxFilingBean.activeEmployees']")
		private WebElement num_e;
		
		@FindBy(xpath="//input[@name='taxFilingBean.terminatedEmployees']")
		private WebElement tax;
		
		@FindBy(xpath="//input[@id='Choose a Date']")
		private WebElement date;
		
		@FindBy(xpath="//body/div/div/div/div/div/div/div/div/div/div/button[2]/div[1]/*[1]")
		private WebElement n;
			
		@FindBy(xpath="//span[.='18']")
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
		private WebElement cont_2;
		
		@FindBy(xpath="//input[@name='bankInformationBean.bankRoutingNumber']")
		private WebElement b_routing;
		
		@FindBy(xpath="//input[@name='bankInformationBean.bankAccountDDA']")
		private WebElement b_acc;
		
		@FindBy(xpath="//input[@name='bankInformationBean.bankName']")
		private WebElement b_name;
		
		@FindBy(xpath="//input[@name='bankInformationBean.bankAddress']")
		private WebElement b_address;
		
		@FindBy(xpath="(//input[@value='1'])[1]")
		private WebElement payroll;
		
		@FindBy(xpath="//div[contains(text(),'(Most Common)')]")
		private WebElement most;
		
		@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
		private WebElement file_upload;
		
		@FindBy(xpath="//span[contains(text(),'Continue')]")
		private WebElement cont_4;
		
		@FindBy(xpath="//input[@name='federalTaxInfoBean.federalId']")
		private WebElement federal;
		
		@FindBy(xpath="//input[@name='federalTaxInfoBean.isSeasonalEmployer' and @value='1']")
		private WebElement seasonal;
		
		@FindBy(xpath="//input[@name='federalTaxInfoBean.isFutaExempt' and @value='2']")
		private WebElement futa;
		
		@FindBy(xpath="//input[@name='federalTaxInfoBean.isAnScorp' and @value='1']")
		private WebElement corp;
		
		@FindBy(xpath="(//div[.='Select state'])[1]")
		private WebElement state;
		
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
		
		@FindBy(xpath="//span[.='Add Local ID']")
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
		private WebElement cont_5;
		
		@FindBy(xpath="//span[contains(text(),'Upload')]")
		private WebElement ill;
		
		@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
		private WebElement emp_f;
		
		//@FindBy(xpath="//span[contains(text(),'Add Manually')]")
		//private WebElement manually;

		@FindBy(xpath="//span[contains(text(),'Continue')]")
		private WebElement cont_6;
		
		@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
		private WebElement payroll1;
		
		@FindBy(xpath="//span[contains(text(),'Continue')]")
		private WebElement cont_7;
		
		@FindBy(xpath="//span[contains(text(),'Finish')]")
		private WebElement finish;
		
		@FindBy(xpath = "//input[@id='refferal']")
		private WebElement id;
		
		@FindBy(xpath="//span[.='Download']")
		private WebElement down;
		
		public void cards(String titlename,String numb,String terminated,String routing,String account, String name,String address,
		String federal_id, String s_tax, String suid,String Rate,
		String l_city,String l_id,String l_psd,String l_digit) 
						throws InterruptedException, AWTException, Exception {
			// TODO Auto-generated method stub
			Thread.sleep(4000);
	      /*order.click();		
           WebDriverWait wait = new WebDriverWait(driver,30);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(geha));
		    element.click();
		    Thread.sleep(3000);
			geha.click();*/
		    Thread.sleep(1000);
		    start_b.click();
            Thread.sleep(4000);
		   Actions actions1 = new Actions(driver);
		    actions1.moveToElement(new_1).click().perform();
		    new_1.click();
		    Actions actions2 = new Actions(driver);
		    actions2.moveToElement(exist).click().perform();
		    exist.click();   
			Thread.sleep(2000);
			title.sendKeys(titlename);
			dba.click();
			shipping.click();
			Thread.sleep(500);
			tab.click();
			Thread.sleep(1000);
			pst.click();
			Thread.sleep(500);
			conti.click();
			Thread.sleep(1000);
			general.click();
			Thread.sleep(500);
			mon.click();
			Thread.sleep(3000);
			num_e.sendKeys(numb);
			Thread.sleep(1000);
			tax.sendKeys(terminated);
			Thread.sleep(500);
			date.click();
			Thread.sleep(500);
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
			Thread.sleep(500);
			to_d.click();
			Thread.sleep(500);
			ok_3.click();
			Thread.sleep(2000);
			cont_2.click();
		   Thread.sleep(2000);
		   b_routing.sendKeys(routing);
		   b_acc.sendKeys(account);
		   b_name.sendKeys(name);
		   Thread.sleep(1000);
		   b_address.sendKeys(address);
		   payroll.click();
		   most.click();
		   Thread.sleep(2000);
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
		   state.click();
		   Thread.sleep(1000);
		   ga.click();
		   state_tax.sendKeys(s_tax);
		   Thread.sleep(1000);
		   state_id.sendKeys(suid);
		   Thread.sleep(500);
		   rate.sendKeys(Rate);
		   exempt.click();
		/*   local.click();
		   Thread.sleep(1000);
		   cityl.sendKeys(l_city);
		   Thread.sleep(300);
		   idl.sendKeys(l_id);
		   psdl.sendKeys(l_psd);
		   digitl.sendKeys(l_digit);
		   exempt1.click();
		   forl.click();
		   type.click();
		   add.click();*/
		   Thread.sleep(1000);
		   cont_5.click();
		   Thread.sleep(500);
		/*  ill.click();
		   emp_f.click();
		   Thread.sleep(2000);
		   Runtime.getRuntime().exec("F:\\File.exe");
		   Thread.sleep(2000);
	    // back.click();
		   cont_6.click();
		   Thread.sleep(1000);
		   payroll1.click();
		   Thread.sleep(2000);
		   Runtime.getRuntime().exec("F:\\File.exe");
		   cont_7.click();
		   finish.click();
		   Thread.sleep(2000);
		   String element1=id.getAttribute("value");
			((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs1.get(1));
			Thread.sleep(2000);
			driver.get(element1);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
			driver.manage().window().maximize();
			 down.click();*/
		   
	}

	}
			
		
