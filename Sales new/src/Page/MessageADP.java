package Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageADP {

	WebDriver driver;
	public MessageADP(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }


@FindBy(xpath="//div[contains(text(),'Message Center')]")
private WebElement message;

@FindBy(xpath="//span[.='Compose']")
private WebElement compose;


@FindBy(xpath="//input[@value='adp']")
private WebElement adp;

@FindBy(xpath="//div[@name='adpSearch']//div//div//button")
private WebElement search;

@FindBy(xpath="//div[contains(text(),'Admin')]")
private WebElement admin ;

@FindBy(xpath="//div[@name='topic']//div//div//button")
private WebElement button;

@FindBy(xpath="//div[contains(text(),'Document Upload Question')]")
private WebElement question;

@FindBy(xpath="//div[@name='subTopic']//div//div//button")
private WebElement sub;

@FindBy(xpath="//div[contains(text(),'Issue Regarding Bank Proof')]")
private WebElement issue;

@FindBy(xpath="//textarea[@name='message']")
private WebElement text;

@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
private WebElement file;

@FindBy(xpath="//span[contains(text(),'Send')]")
private WebElement send;


public void message(String text1) throws InterruptedException, IOException {
	Thread.sleep(2000);
	message.click();
	Thread.sleep(2000);
	compose.click();
	Thread.sleep(2000);
	adp.click();
	Thread.sleep(2000);
	search.click();
	admin.click();
	Thread.sleep(2000);
	button.click();
	Thread.sleep(2000);
	question.click();
	Thread.sleep(2000);
	sub.click();
	issue.click();
	text.sendKeys(text1);
	Thread.sleep(2000);
	file.click();
	Runtime.getRuntime().exec("F:\\File.exe");
	Thread.sleep(1000);
	send.click();
	
}
	
}

