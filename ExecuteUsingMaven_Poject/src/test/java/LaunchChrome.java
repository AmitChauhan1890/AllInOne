import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchChrome {

	WebDriver driver=null;
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "InputTestData/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closerBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void testCase1()
	{
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.get("http://youtube.com");
		System.out.println(driver.getTitle());
	}
}
