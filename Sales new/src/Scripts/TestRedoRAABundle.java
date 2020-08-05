package Scripts;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.Login;
import Page.RedoRAABundle;

public class TestRedoRAABundle extends Dummy{
	@Test(dependsOnMethods = "login")
	
public void redo() throws InterruptedException
{
	RedoRAABundle bundlePage=new RedoRAABundle(driver);
	bundlePage.redo();
	System.out.println("successfully created redo bundle");
}
	
@Test
public void login() throws InterruptedException
{
	Login loginPage = new Login(driver);
	loginPage.login("welase@grr.la", "Vinod123@");
	System.out.println("successfully");
}
	
}
