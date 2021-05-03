package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import Common.Dummy;
import Page.HelpResource;
import Page.Login;
import Utilities.Generics;

public class TestFaq extends Dummy{

	@Test(dependsOnMethods = "login")
	public void faq () throws InterruptedException, IOException
	{
		HelpResource faqpage=new HelpResource(driver);
		faqpage.faq("Testing","Test1","Content new","testing","https://referralsolutionplatform.com/processorders","Url title");
		System.out.println();
	}

	@Test
	public void login() throws InterruptedException, IOException{
	Generics gene=new Generics();
	{
		Login loginPage = new Login(driver);
		loginPage.login(gene.getPropertieData().getProperty("email"),"Vinod321@");
		System.out.println(" login completed");
	}

	}
}
