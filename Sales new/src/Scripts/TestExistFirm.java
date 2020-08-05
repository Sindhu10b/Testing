package Scripts;

import org.testng.annotations.Test;

import Common.Base;
import Page.ExistFirm;
import Page.FirmPassword;
import Page.Login;
import Page.WizardsBundle;

public class TestExistFirm extends Base{
	
	@Test(dependsOnMethods="firmpassword")
	public void wizardsbundle() throws InterruptedException {
	WizardsBundle bundlePage=new WizardsBundle(driver);
	bundlePage.wizards("Joop","joopm@gmail.com");
	
	}
	
	
	@Test(dependsOnMethods="exist")
	 public void firmpassword() {
	 FirmPassword cpaPage = new FirmPassword(driver);
	 cpaPage.firmpassword("Vinod123@", "Vinod123@", "Vinod123@");
	}
	
	@Test(dependsOnMethods="login")
	public void exist() throws InterruptedException {
		
		ExistFirm existPage=new ExistFirm(driver);
		existPage.exist("vola", "volawebe@dr-mail.net","2773 Tetrick Road","Saint Petersburg","33716","hara", 
			"hara", "863-249-9201","00678");
    }
	@Test
	public void login() throws InterruptedException {
		Login loginPage = new Login(driver);
		loginPage.login("qa.adpadmi@gmail.com", "Vinod321@");
		System.out.println("successfully");
    }
	
}
