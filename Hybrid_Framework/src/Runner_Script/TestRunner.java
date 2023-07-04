package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_Test;
import POM_Script.Login_to_Facebook;

public class TestRunner extends Base_Test
{
@Test(dataProvider = "testData")
public void test(String d1, String d2) throws InterruptedException
{
	Login_to_Facebook p=new Login_to_Facebook(driver);
	p.passUN(d1);
	p.passPWD(d2);
	Thread.sleep(2000);
	p.clickButton();
	
}
	@DataProvider(name = "testData")
	public Object[][] createData1() 
	{
		return new Object[][]
		 {
   { "Anju", "2345" },
   { "Nandu", "5678"},
 };
}
}
