package Generic_Script;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_GS 
{
	public Select s;
	public void dropdownselect(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void dropdowndeselect(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
}
