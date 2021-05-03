package Scripts;

import java.io.IOException;
import org.testng.annotations.Test;
import Common.Invitelink;
import Page.Cards;
import Page.Inviteemp;

public class Testinviteemp extends Invitelink
{
	@Test(dependsOnMethods="cards")
	
	public void inviteemp() throws InterruptedException, IOException {
		
	Inviteemp emppage = new Inviteemp(driver);
	emppage.emp("Linda","M","Pompa","pouik@gmail.com","5467879787","3426  Wexford Way",
			"FRONTENAC","67890","567899088","10","1","1","10","1","1","world bank","34567898765",
			"456787658");
	}
        @Test 
        public void cards() throws Exception
		   {
            Cards cardspage = new Cards(driver);
			cardspage.cards("Vinod123@","Vinod123@","45","10", "45896788678", "8659657868", "Brown bank", "2239  Brown Street", "546788978",
					            "56789", "4567897688","123456789", "California", "45678", url, url, url, url);
			System.out.println("success draft order cards page");
		   }
        
    /*	public void login() throws InterruptedException 
    	{
    		Login loginPage = new Login(driver);
    		loginPage.login("caviwojes@tympe.net", "Vinod123@");
    		System.out.println("successfully");
        }
	*/
}