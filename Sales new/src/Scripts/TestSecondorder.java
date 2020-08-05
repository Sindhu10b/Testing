package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.Login;
import Page.SecondorderCPA;

public class TestSecondorder extends Dummy{
	
    @Test(dependsOnMethods = "login")
    public void second() throws InterruptedException, IOException
    {
    	SecondorderCPA secondPage= new SecondorderCPA(driver);
    	secondPage.second("tester","Tester name","2311  Sycamore Circle","AMESBURY","12345","45","10", "45896788678", "8659657868","Brown bank", "2239  Brown Street","546788978","CA",
					"299709919","99-99109","560","","1000090","4700","3000");
    }
    @Test
	public void login() throws InterruptedException
	{
		Login loginPage = new Login(driver);	
		loginPage.login("welase@grr.la", "Vinod123@");
		System.out.println("successfully");
    }
}
