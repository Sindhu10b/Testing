package Scripts;

import org.testng.annotations.Test;

import Common.Base;
import Page.Login;
import Page.SalesOrder;

public class TestSalesOrders extends Base{
	
	@Test(dependsOnMethods="login")
	public void salesorder() throws InterruptedException {
	SalesOrder salesPage=new SalesOrder(driver);
	salesPage.orders("jopl","jopl@gmail.com","456 Rafe lane", "Alaska","5678");
}
   
	@Test
	public void login() throws InterruptedException {
		Login loginPage = new Login(driver);
		loginPage.login("doke@grr.la","Vinod321@");
		System.out.println("successfully");

	}
}   
