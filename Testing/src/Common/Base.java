package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Base {
	public WebDriver driver;
	public WebDriverWait driverWait;
	public String baseUrl = "https://referralsolutionplatform.com";
	public String url="https://salesenablementsolution.com";
	// public String newUrl = "https://temp-mail.org/en/";

	@BeforeClass
	public void openBrowser() throws InterruptedException {
		/*System.setProperty("webdriver.ie.driver", "./drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get(baseUrl);
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();*/
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();


	}

}


