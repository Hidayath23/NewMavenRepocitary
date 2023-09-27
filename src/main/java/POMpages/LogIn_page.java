package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMProject_GenerialUtilities.BaseClass;

public class LogIn_page extends BaseClass
{
	@FindBy(name="hr_email")
	private WebElement HrEmailEdit;
	
	@FindBy(name="hr_password")
	private WebElement passwordEdit;
	
	@FindBy(name = "hr_type")
	private WebElement HrTypeEdit;

	@FindBy(name = "login_hr")
	private WebElement LoginHr;

	
	//Initialization
	public LogIn_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
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

	
	//Buisness Library
	public void login(String username, String password)
	{
		HrEmailEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		//selectDropDown(text, HrTypeEdit);
		LoginHr.click();
	}
	
}
