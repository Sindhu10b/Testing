package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Invitelink {
	
	public WebDriver driver;
	public WebDriverWait driverWait;
	public String url="https://melissa.referralsolutionplatform.com/new-client?cit=a1dec5b6-5305-4741-9d80-812dcd066f53";
	@BeforeClass
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
