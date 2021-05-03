package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Base;
import Page.Login;
import Page.MessageADP;

public class TestSMC extends Base {
	
     @Test(dependsOnMethods="login")
      public void message() throws InterruptedException, IOException {
      MessageADP messagePage=new MessageADP(driver);
	messagePage.message("Hello");
	}
	
     @Test
		public void login() throws InterruptedException {
			Login loginPage = new Login(driver);
			loginPage.login("soke@grr.la", "Vinod123@");
			System.out.println("successfully");
	}
	
}
