package Scripts;

import org.testng.annotations.Test;

import Common.Base;
import Page.SalesLogin;

public class TestSalesLogin extends Base{
	
	@Test
	public void saleslogin() throws InterruptedException {
	SalesLogin salesPage=new SalesLogin(driver);
	salesPage.sale("John","12345","5678","koml","Vinod123@","Vinod123@");
}
}
