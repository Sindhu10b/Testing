package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.Login;
import Page.MessageCPA;

public class TestSMCCpa extends Dummy{
	
		
	     @Test(dependsOnMethods="login")
	      public void cpa() throws InterruptedException, IOException {
	      MessageCPA messagePage=new MessageCPA(driver);
		messagePage.cpa("Hello testing");
		}
		
	     @Test
			public void login() throws InterruptedException {
				Login loginPage = new Login(driver);
				loginPage.login("qa.cpaadmi@gmail.com", "Vinod321@");
				System.out.println("successfully");
		}
		
	}


