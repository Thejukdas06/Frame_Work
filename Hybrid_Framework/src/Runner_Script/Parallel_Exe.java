package Runner_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Exe
{
	public WebDriver driver;
@Test
@Parameters({"browser"})
public void exec(String browser)
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	
	if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https:/www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
	else
	{
		driver=new ChromeDriver();
		driver.get("https:/www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
}
