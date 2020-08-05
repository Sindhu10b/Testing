package Scripts;

import org.testng.annotations.Test;

import Common.Base;
import Page.Login;
import Page.PromoSpecial;

public class TestSpecialPromo 	extends Base  {
	
		@Test(dependsOnMethods="login")
		public void promospecial() throws InterruptedException 
		{	
		PromoSpecial promoPage=new PromoSpecial(driver);
		promoPage.special("365 Multiservices LLC","Doris Vargas","365 years","Alaska","John Jonhy", 
				"Special offer","50","2000","Testing");
		System.out.println("promo created");
		}
		
		@Test
		public void login() throws InterruptedException 
		{	
			Login loginPage = new Login(driver);
			loginPage.login("qa.adpadmi@gmail.com", "Vinod321@");
			System.out.println("successfully");
	     }
	}


