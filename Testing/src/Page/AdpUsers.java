package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdpUsers {

	
	WebDriver driver;

	public AdpUsers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//div[contains(text(),'Manage Users')]")
	private WebElement user;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div/div[3]/div[2]/button/span[1]")
	private WebElement add;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")
	private WebElement mail;
	
	@FindBy(xpath="//span[contains(text(),'Create Registration Link')]")
	private WebElement link;
	

public void usersadp(String Name, String email) throws InterruptedException {
	Thread.sleep(2000);
	user.click();
	add.click();
	name.sendKeys(Name);
	mail.sendKeys(email);
	Thread.sleep(500);
	link.click();
	
}}