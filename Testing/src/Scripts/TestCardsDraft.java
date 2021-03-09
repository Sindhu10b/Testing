
package Scripts;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.CardsDraft;
import Page.DraftReg;
import Page.Login;
	
public class TestCardsDraft extends Dummy {
            @Test(dependsOnMethods = "draft")
		    public void cards_d() throws Exception
		   {
            CardsDraft cardspage = new CardsDraft(driver);
			cardspage.cards("tester","45","10", "45896788678", "8659657868","Brown bank", "2239  Brown Street","546788978",
					"999-9999","999-0099","560","tester","1000090","4700","3000");
			System.out.println("success draft order cards page");
           }
 
	@Test(dependsOnMethods = "login")
		    public void draft() throws InterruptedException {
			DraftReg draftpage = new DraftReg(driver);
			draftpage.draft("Reynaldo D Shatley","tikodih305@tmauv.com", "6576868691", "1300  Hillcrest Circle", "Minneapolis",
					"55415", "656789874", "Computer Network Architect", "Computer Network Architect");
			System.out.println("client");
		}

		@Test
		public void login() throws InterruptedException
		{
			Login loginPage = new Login(driver);
			loginPage.login("welase@grr.la", "Vinod123@");
			System.out.println("successfully");
	    }
	}

	
	
	
	
	
	
	
	

