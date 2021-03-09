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
	bundlePage.wizards("Joop","joeepm@gmail.com");
	
	}
	
	
	@Test(dependsOnMethods="exist")
	 public void firmpassword() {
	 FirmPassword cpaPage = new FirmPassword(driver);
	 cpaPage.firmpassword("Vinod123@", "Vinod123@", "Vinod123@");
	}
	
	@Test(dependsOnMethods="login")
	public void exist() throws InterruptedException {
		
		ExistFirm existPage=new ExistFirm(driver);
		existPage.exist("Moken", "moken72641@lidte.com","2773 Tetrick Road","Saint Petersburg","33716","Testmokeen", 
			"testmokeen", "863-249-9201","01078");
    }
	@Test
	public void login() throws InterruptedException {
		Login loginPage = new Login(driver);
		loginPage.login("qa.adpadmi@gmail.com", "Vinod321@");
		System.out.println("successfully");
    }
	
}
