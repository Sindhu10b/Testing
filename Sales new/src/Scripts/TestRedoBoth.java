package Scripts;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.Login;
import Page.RedoBoth;

public class TestRedoBoth extends Dummy{
	@Test(dependsOnMethods = "login")
	public void redoboth() throws InterruptedException
	{
		RedoBoth redoPage= new RedoBoth(driver);
		redoPage.redoboth();
		System.out.println("redo testing");
	}
	
	@Test
	public void login() throws InterruptedException
	{
		Login loginPage = new Login(driver);
		loginPage.login("welase@grr.la", "Vinod123@");
		System.out.println("successfully");
    }	

}
