package Scripts;
import java.io.IOException;

import org.testng.annotations.Test;

import Common.Base;
import Page.Login;
import Utilities.Generics;

	public class TestLogin extends Base {
				

	@Test
		public void test() throws InterruptedException, IOException {
		Generics gene=new Generics();
			Login loginPage = new Login(driver);
			loginPage.login(gene.getPropertieData().getProperty("email"),
				gene.getPropertieData().getProperty("password"));
			
			System.out.println("successfully");

		}
	
	}


