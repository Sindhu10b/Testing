package Scripts;

import org.testng.annotations.Test;

import Common.Base;
import Page.Sales_Login;

public class TestSalesLogin extends Base{
	
	@Test
	public void saleslogin() throws InterruptedException {
	Sales_Login salesPage=new Sales_Login(driver);
	salesPage.sale("John","12345","5678","koml","Vinod123@","Vinod123@");
}
}
