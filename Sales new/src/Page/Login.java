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

		@FindBy(xpath = "//input[@name='username']")
		private WebElement User_name;

		@FindBy(xpath = "(//input[@name='password'])[1]")
		private WebElement Password;

      //@FindBy(xpath = "(//span[contains(text(),'Sign In')])")
	// private WebElement button;
		
	@FindBy(xpath="//span[contains(text(),'Login')]")
      private WebElement login; 
     	
		public void login(String email, String password) throws InterruptedException {
			Thread.sleep(2000);
			User_name.sendKeys(email);
			Password.sendKeys(password);
			Thread.sleep(500);
		  //  button.click();
			Thread.sleep(3000);
		    login.click();
			Thread.sleep(2000);
		}
	}



