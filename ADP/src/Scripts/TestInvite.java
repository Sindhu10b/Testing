package Scripts;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.InviteClients;
import Page.Login;

public class TestInvite extends Dummy
{
	
	@Test(dependsOnMethods = "login")
    public void inviteclients()  throws InterruptedException
	{
	 InviteClients invitepage=new InviteClients(driver);
	 invitepage.inviteclients("Dilep Jhn & test","dilepa@hpinst.com","4567 Rafe lane",
			 "Zearing","50278","455657789","Furniture shop Store","Furniture shop Store");
	 System.out.println("configuration");	
    }
	
	@Test
	public void login() throws InterruptedException 
	{
		Login loginPage = new Login(driver);
		loginPage.login("qa.cpaadmi@gmail.com", "Vinod321@");
		System.out.println("successfully");
    }
	
}
