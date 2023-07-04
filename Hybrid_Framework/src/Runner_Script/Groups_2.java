package Runner_Script;

import org.testng.annotations.Test;
@Test(groups = "IncludeClass")
public class Groups_2 
{
	@Test(groups = "Smoke")
	public void tets3()
	{
		System.out.println("Hello Bangalore");
	}
}
