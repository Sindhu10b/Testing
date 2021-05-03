package Scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Common.Invitelink;
import Page.Cards;

	public class TestCards extends Invitelink
	{
		@Test
	public void cards()  throws AWTException, Exception

		{
			Cards cardspage=new Cards(driver);
			cardspage.cards("Vinod123@","Vinod123@","test","45","10","234566788","4566788868","World bank","345 rafe lane",
	        "546788978","CA", "5GFJ/-6789","4567897688","560","tester","1000090","4700","3000");
		}		
	}
	
	
