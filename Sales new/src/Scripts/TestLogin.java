package Scripts;
import org.testng.annotations.Test;

import Common.Base;
import Page.Login;

	public class TestLogin extends Base {
				

	@Test
		public void test() throws InterruptedException {
			Login loginPage = new Login(driver);
			loginPage.login("qa.adpadmi@gmail.com","Vinod321@");
			System.out.println("successfully");

		}
	
	}

	
	
	


