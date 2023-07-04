package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Generic_Script.Base_Page;

public class Login_to_Facebook extends Base_Page
{
@FindBy(id="email")
private WebElement unField;
@FindBy(id="pass")
private WebElement passField;
@FindBy(name="login")
private WebElement loginButton;

public  Login_to_Facebook(WebDriver driver)
{
	super(driver);
}
public void passUN(String un)
{
	unField.sendKeys(un);
}
public void passPWD(String pwd)
{
	passField.sendKeys(pwd);
}
public void clickButton()
{
	loginButton.click();;
}

}
