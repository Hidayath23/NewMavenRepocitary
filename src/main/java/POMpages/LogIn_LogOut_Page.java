package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LogIn_LogOut_Page
{
	@FindBy(name="hr_email")
	private WebElement HrEmailEdit;
	
	@FindBy(name="hr_password")
	private WebElement passwordEdit;
	
	@FindBy(name = "hr_type")
	private WebElement HrTypeEdit;

	@FindBy(name = "login_hr")
	private WebElement LoginHr;
	
	//Need to handle a popup here(Cinfirmation popup)
	
	@FindBy(xpath="//li[@class='nav-item dropdown']")
	private WebElement PowerOffDropDown;
	
	@FindBy(xpath="//i[@class='fa fa-power-off']")
	private WebElement PowerOffButton;

	public WebElement getHrEmailEdit()
	{
		return HrEmailEdit;
	}

	public WebElement getPasswordEdit() 
	{
		return passwordEdit;
	}

	public WebElement getHrTypeEdit() 
	{
		return HrTypeEdit;
	}

	public WebElement getLoginHr()
	{
		return LoginHr;
	}

	public WebElement getPowerOffDropDown()
	{
		return PowerOffDropDown;
	}

	public WebElement getPowerOffButton() 
	{
		return PowerOffButton;
	}

	public void setHrEmailEdit(WebElement hrEmailEdit) 
	{
		HrEmailEdit = hrEmailEdit;
	}

	public void setPasswordEdit(WebElement passwordEdit)
	{
		this.passwordEdit = passwordEdit;
	}

	public void setHrTypeEdit(WebElement hrTypeEdit) 
	{
		HrTypeEdit = hrTypeEdit;
	}

	public void setLoginHr(WebElement loginHr)
	{
		LoginHr = loginHr;
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
