package Scripts;

import org.testng.annotations.Test;

import Common.Base;
import Page.Login;
import Page.PromoGlobal;

public class TestPromoGlobal extends Base {

	
	@Test(dependsOnMethods="login")
	public void promoglobal() throws InterruptedException  {
	
	PromoGlobal promoPage=new PromoGlobal(driver);
	promoPage.promo("test Promo","SUPERCOOL","30","Testing purpose");
	System.out.println("promo created");
	}
	
	@Test
	public void login() throws InterruptedException {
	
		Login loginPage = new Login(driver);
		loginPage.login("qa.adpadmi@gmail.com", "Vinod321@");
		System.out.println("successfully");
}
}
