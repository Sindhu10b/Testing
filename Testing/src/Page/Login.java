package Page;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
public class Login {

		WebDriver driver;

		public Login(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
       
		@FindBy(xpath="/html/body/div[2]/div[3]/div/div[3]/button/div/span")
		private WebElement ok;
		
		@FindBy(xpath = "//input[@name='username']")
		private WebElement User_name;

		@FindBy(xpath = "(//input[@name='password'])[1]")
		private WebElement Password;

        @FindBy(xpath = "(//span[contains(text(),'Sign In')])")
	    private WebElement button;
		
	    @FindBy(xpath="//span[contains(text(),'Login')]")
        private WebElement login; 
     	
		public void login(String email, String password) throws InterruptedException {
			Thread.sleep(2000);
			/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 Alert alert=driver.switchTo().alert();
		        System.out.println(alert.getText());
		        alert.accept();*/
			User_name.sendKeys(email);
			Password.sendKeys(password);
			Thread.sleep(500);
		  //button.click();
			Thread.sleep(3000);
		   login.click();
			Thread.sleep(2000);
		}
	}



