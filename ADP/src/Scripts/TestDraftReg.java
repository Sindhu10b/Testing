package Scripts;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.DraftReg;
import Page.Login;

public class TestDraftReg extends Dummy {
	@Test(dependsOnMethods="login")
	public void draft() throws InterruptedException 
	{
		DraftReg draftpage=new DraftReg(driver);
		draftpage.draft("peri","perijip@web.net","6576868691","2538  Adams Avenue",
		                "Minneapolis","55415","656789874","Total Business","Total Business");
		System.out.println("client");
	}

	@Test
	public void login() throws InterruptedException {
		Login loginPage = new Login(driver);
		loginPage.login("welase@grr.la", "Vinod123@");
		System.out.println("successfully");
}
}

