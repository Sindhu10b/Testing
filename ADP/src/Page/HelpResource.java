package Page;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpResource {
WebDriver driver;
public HelpResource(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
    @FindBy(xpath=("//div[contains(text(),'Help & Resource')]"))
    private WebElement  help;

    @FindBy(xpath=("/html[1]/body[1]/div[1]/div[3]/div[1]/div[7]/div[2]/div[1]/button[1]"))
    private WebElement newsection ;

    @FindBy(xpath=("//input[@name='sectionTitle']"))
    private WebElement title;

    @FindBy(xpath=("/html/body/div[2]/div[3]/div/div[2]/form/div[2]/button/span[1]"))
    private WebElement subsection;

    @FindBy(xpath=("//input[@name='subSectionTitle[0].subSectionName']"))
    private WebElement sub1;

    @FindBy(xpath=("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/form[1]/div[2]/button[1]/span[1]"))
    private WebElement subsection1;

    @FindBy(xpath=("//span[contains(text(),'Save')]"))
    private WebElement save ;

    @FindBy(xpath=("//body/div[@id='root']/div[3]/div[1]/div[7]/div[2]/ul[1]/div[1]/div[1]/div[2]/button[1]/div[1]/*[1]"))
    private WebElement content;

    @FindBy(xpath=("//div[contains(text(),'Add Content')]"))
    private WebElement adding;

    @FindBy(xpath=("//input[@name='title']"))
    private WebElement conttitle;
    
    @FindBy(xpath=("//textarea[@name='description']"))
    private WebElement contdes;
    
    @FindBy(xpath = ("//input[@name='link']"))
    private WebElement link;
    
    @FindBy(xpath=("//input[@name='linkTitle']"))
    private WebElement linktitle;
    
   @FindBy(xpath=("//span[contains(text(),'Add Attachments')]"))
    private WebElement file;
   
   @FindBy(xpath="//span[contains(text(),'Save')]")
   private WebElement save_file;


public void faq(String Title, String Sub,String c_title,String c_description,String Link_1 ,
		String Link_Title) throws InterruptedException, IOException {
	Thread.sleep(4000);
help.click();
//Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
newsection.click();
Thread.sleep(1000);
title.sendKeys(Title);
subsection.click();
Thread.sleep(500);
sub1.sendKeys(Sub);
subsection1.click();
save.click();
Thread.sleep(1000);
content.click();
Thread.sleep(500);
adding.click();
Thread.sleep(500);
conttitle.sendKeys(c_title);
contdes.sendKeys(c_description);
link.sendKeys(Link_1);
linktitle.sendKeys(Link_Title);
file.click();
Thread.sleep(2000);
Runtime.getRuntime().exec("F:\\File.exe");
Thread.sleep(4000);
save_file.click();


}
}
