package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Common.Dummy;
import Page.CardsDraft;
import Page.CardsDraft1;
import Page.DraftReg;
import Page.Login;
import Utilities.Generics;

public class TestCardsDraft1 extends Dummy {
	
	@Test(dependsOnMethods="cards")
	public void draft1() throws InterruptedException, Exception
	   {
		CardsDraft1 cardspage1=new CardsDraft1(driver);
		cardspage1.drafts("Linda","M","sapek","sapeiw@appmail.top","5467879787","3426 Wexford Way",
		"FRONTENAC","34567","567899088",
		"21","11","60","10","testing","40",  "20","10","12","11","20",
		"1","2","3","4","10",
		"1","12","Test local","Local",
		"world bank","34567898765","3455666",
		"200", "Chicago","Testing", "1001","10001",
		" PayeeTester","John Payee","134 Mountain lake","900012312");
	    System.out.println("sucess");
     	}
	
       @Test(dependsOnMethods = "draft")
	    public void cards() throws Exception
	   {
        CardsDraft cardspage = new CardsDraft(driver);
		cardspage.cards("Tester","45","10", "45896788678", "8659657868", "Brown bank", "2239 Brown Street","546788978",
				"9990099-AB","999123-00","1.8","tester","1000090","4700","3000");
		System.out.println("Filling the details in wizards");
        }

        @Test(dependsOnMethods = "login")
	    public void draft() throws InterruptedException, IOException {
        	Generics gene=new Generics();
		DraftReg draftpage = new DraftReg(driver);
		draftpage.draft(gene.getPropertieData().getProperty("clientname"),gene.getPropertieData().getProperty("randomemail")+Generics.timeStamp+"@yopmail.com", 
				"6576868691", "3603 Williams Lane", "Wichita",
				"55415", "656789874", "Full-time work", 
				"Full-time work");
	    	System.out.println("Order created");
	     }
		@Test
		public void login() throws InterruptedException
		{
			Login loginPage = new Login(driver);
			loginPage.login("welase@grr.la","Vinod123@");
			System.out.println(" login completed");
	    }
		
}
