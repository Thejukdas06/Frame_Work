package Runner_Script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Generic_Script.Base_Test;
import Generic_Script.DDT;
import Generic_Script.Extent_Report_Generic;
import Generic_Script.Screenshot;
import POM_Script.Login_to_Facebook;

public class Excel_Runner extends Base_Test
{
	@Test
	public void valid_login() throws InterruptedException, IOException
	{
		Login_to_Facebook l=new Login_to_Facebook(driver);
		String un = DDT.getData("Sheet1", 1, 0);
		l.passUN(un);
		Thread.sleep(2000);
		String pwd1 = DDT.getData("Sheet1", 1, 1);
		l.passPWD(pwd1);
		Thread.sleep(2000);
		l.clickButton();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.facebook.com/");
		Screenshot.getPhoto(driver);
		Extent_Report_Generic.report();
	}
}	
