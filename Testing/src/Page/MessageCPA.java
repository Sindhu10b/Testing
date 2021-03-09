package Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class MessageCPA {
	WebDriver driver;
	public MessageCPA(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Message Center')]")
	private WebElement center;
	
	@FindBy(xpath="//span[contains(text(),'Compose')]")
	private WebElement comp;
	
	@FindBy(xpath="//div[contains(text(),'Upload Additional Documents')]")
	private WebElement topic;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement text;
	
	@FindBy(xpath="//div[contains(text(),'Browse or Drag & drop file here')]")
	private WebElement file;
	
	@FindBy(xpath="//span[contains(text(),'Send')]")
	private WebElement send;
	
	public void cpa(String text1) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		center.click();
		Thread.sleep(2000);
		comp.click();
		Thread.sleep(2000);
		topic.click();
		Thread.sleep(2000);
		text.sendKeys(text1);
		file.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("F:\\File.exe");
		Thread.sleep(1000);
		send.click();	
	}
}
