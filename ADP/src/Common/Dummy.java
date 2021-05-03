package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Dummy {
	public WebDriver driver;
	public WebDriverWait driverWait;
	public String baseUrl = "https://veraring.referralsolutionplatform.com";
			//"https://sope.referralsolutionplatform.com";
			//"https://libertytax.referralsolutionplatform.com";
			//"https://yobe.referralsolutionplatform.com";

	@BeforeClass
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}

