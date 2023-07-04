package Generic_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_GS
{
	public Actions act;
	public void mousehoveraction(WebDriver driver, WebElement ele)
	{
		act=new Actions(driver);
		act.moveToElement(ele);
	}
	public void doubleclick(WebDriver driver, WebElement ele)
	{
		act=new Actions(driver);
		act.doubleClick(ele);
	}
	public void draganddrop(WebDriver driver, WebElement src, WebElement dst)
	{
		act=new Actions(driver);
		act.dragAndDrop(src, dst);
	}
	public void rightclick(WebDriver driver, WebElement ele)
	{
		act=new Actions(driver);
		act.contextClick(ele);
	}
}
