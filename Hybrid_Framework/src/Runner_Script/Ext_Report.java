package Runner_Script;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Ext_Report 
{
@Test
public void test()
{
	ExtentReports rep=new ExtentReports("./Reports/R1.html", false);
	ExtentTest t1 = rep.startTest("tc1");
	t1.log(LogStatus.PASS, "Passed testcase");
	t1.log(LogStatus.FAIL, "Failed testcase");
	t1.log(LogStatus.SKIP, "Skipped testcase");
	rep.endTest(t1);
	rep.flush();
}
}
