package POMpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut_Page 
{
	@FindBy(xpath="//li[@class='nav-item dropdown']")
	private WebElement PowerOffDropDown;
	
	@FindBy(xpath="//i[@class='fa fa-power-off']")
	private WebElement PowerOffButton;

	public WebElement getPowerOffDropDown() 
	{
		return PowerOffDropDown;
	}

	public WebElement getPowerOffButton()
	{
		return PowerOffButton;
	}

	public void setPowerOffDropDown(WebElement powerOffDropDown) 
	{
		PowerOffDropDown = powerOffDropDown;
	}

	public void setPowerOffButton(WebElement powerOffButton)
	{
		PowerOffButton = powerOffButton;
	}
	
	
}
