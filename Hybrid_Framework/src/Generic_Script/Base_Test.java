package Generic_Script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_Const
{
	public WebDriver driver;
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty(chrome_key,chrome_value);
		//To launch browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//To enter url
		driver.get(base_url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@AfterMethod
	public void CloseAppln(ITestResult res) throws IOException
	{
	if(ITestResult.FAILURE==res.getStatus())
		{
		Screenshot.getPhoto(driver);
		}
		driver.close();
	}
}