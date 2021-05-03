package Scripts;

import org.testng.annotations.Test;
import Common.Dummy;
import Page.Login;
import Page.WizardsBundle;

public class TestWizardsBundle extends Dummy{
	
	@Test(dependsOnMethods="login")
	public void wizardsbundle() throws InterruptedException {
	WizardsBundle bundlePage=new WizardsBundle(driver);
	bundlePage.wizards("Joke","joke@gmail.com");
	}
	
		@Test
		public void login() throws InterruptedException {
			Login loginPage = new Login(driver);
			loginPage.login("river@gmail.com", "Vinod123@");
			System.out.println("successfully");
	}	
	
}
