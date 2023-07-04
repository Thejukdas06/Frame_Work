package Runner_Script;

import org.testng.annotations.Test;
@Test(groups = "IncludeClass")
public class Groups_1 
{
@Test(groups = "Sanity")
public void tets1()
{
	System.out.println("Hello world");
}
@Test(groups = {"Sanity","Smoke"})
public void tets2()
{
	System.out.println("Hello India");
}
}
