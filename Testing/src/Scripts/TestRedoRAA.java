package Scripts;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.Login;
import Page.RedoRAA;

public class TestRedoRAA extends Dummy {
	
	@Test(dependsOnMethods = "login")
	public void redo() throws InterruptedException
	{
		RedoRAA redoPage= new RedoRAA(driver);
		redoPage.redo();
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
