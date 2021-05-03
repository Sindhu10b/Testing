package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Base;
import Page.Firm;
import Page.Login;

public class TestFirm extends Base {

	@Test(dependsOnMethods = "login")
	public void firm() throws InterruptedException, IOException {
		Firm firmPage = new Firm(driver);
		firmPage.firm("koyle", "koyleww@gmail.com", "2773 Tetrick Road", "Saint Petersburg", "FH", "33716", "koyle",
				"koyle", "863-249-9201", "456787657", "567", "456", "234", "56", "100");
		System.out.println("created successfully");
	}

	@Test
	public void login() throws InterruptedException {
		Login loginPage = new Login(driver);
		loginPage.login("soke@grr.la", "Vinod123@");
		System.out.println("successfully");
}

}
