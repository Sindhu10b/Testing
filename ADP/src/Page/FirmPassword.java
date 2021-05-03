
package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirmPassword {


	WebDriver driver;

	public FirmPassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[contains(@type,'password')])[1]")
	private WebElement c_passowrd;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	private WebElement confirm;

	@FindBy(xpath = "//span[contains(text(),'Register')]")
	private WebElement register;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']") 
	private WebElement login;

	public void firmpassword(String password, String confirmpassword, String password2)
	{
		try {
			Thread.sleep(3000);
			c_passowrd.sendKeys(password);
			confirm.sendKeys(confirmpassword);
			register.click();
			Thread.sleep(4000);
			pass.sendKeys(password2);
			Thread.sleep(2000);
			login.click();
			//Thread.sleep(2000);
}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	
}