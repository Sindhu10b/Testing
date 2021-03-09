package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import Common.Base;
import Page.AdpUsers;
import Page.Login;
import Utilities.Generics;


public class TestUsersAdp extends Base {

	@Test(dependsOnMethods = "login")
	public void usersadp() throws InterruptedException, IOException
	{
		Generics gene=new Generics();
		AdpUsers userpage=new AdpUsers(driver);
		userpage.usersadp("Sales",
	    gene.getPropertieData().getProperty("randomemail")+Generics.timeStamp+"@yopmail.com");	
		System.out.println("Created user");
	}

	@Test
	public void login() throws InterruptedException, IOException
	{
		Generics gene=new Generics();
		Login loginPage = new Login(driver);
		loginPage.login(gene.getPropertieData().getProperty("email"),
				gene.getPropertieData().getProperty("password"));
		System.out.println(" login completed");
	}
}