package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Base;
import Page.Firm;
import Page.FirmPassword;
import Page.Login;
import Page.S_Wizards;

public class TestS_Wizards extends Base{
	
	@Test(dependsOnMethods="firmpassword")
	public void s_wizards() throws InterruptedException {
		S_Wizards wizardsPage=new S_Wizards(driver);
		wizardsPage.s_wizards("test");
		System.out.println("wizards");
	}
	
	@Test(dependsOnMethods="firm")
	 public void firmpassword() {
	 FirmPassword cpaPage = new FirmPassword(driver);
	 cpaPage.firmpassword("Vinod123@", "Vinod123@", "Vinod123@");
	}
	
	@Test(dependsOnMethods = "login")
	public void firm() throws InterruptedException, IOException {
		Firm firmPage = new Firm(driver);
		firmPage.firm("madan", "madaney483@clsn1.com", "2773 Tetrick Road", "Saint Petersburg", "FH", "33716", "wico",
				"wico", "863-249-9201", "456787657", "567", "456", "234", "56", "100");
		System.out.println("created successfully");
	}
		@Test
		public void login() throws InterruptedException {
			Login loginPage = new Login(driver);
			loginPage.login("soke@grr.la", "Vinod123@");
			System.out.println("successfully");
	}
	

}
