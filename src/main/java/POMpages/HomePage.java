package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRMProject_GenerialUtilities.BaseClass;

public class HomePage extends BaseClass
{
	@FindBy(xpath="//i[@class='nav-icon fa fa-handshake']")
	private WebElement AddCorporateButton;	
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-code-branch']")
	private WebElement AddBranchButton;	
	
	@FindBy(xpath="(//i[@class='nav-icon fas fa-user'])[1]")
	private WebElement Emplyee;

	@FindBy(xpath="(//i[@class='nav-icon fas fa-user'])[1]")
	private WebElement AdminButton;

	@FindBy(xpath="//li[@class='nav-item dropdown']")
	private WebElement PowerOffDropDown;
	
	@FindBy(xpath="//i[@class='fa fa-power-off']")
	private WebElement PowerOffButton;

	
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getAddCorporateButton()
	{
		return AddCorporateButton;
	}

	public WebElement getAddBranchButton() 
	{
		return AddBranchButton;
	}

	public WebElement getEmplyee() 
	{
		return Emplyee;
	}

	public WebElement getAdminButton() 
	{
		return AdminButton;
	}

	public WebElement getPowerOffDropDown()
	{
		return PowerOffDropDown;
	}

	public WebElement getPowerOffButton()
	{
		return PowerOffButton;
	}
	
	//Buisness library
	public void homePage()
	{
		AddCorporateButton.click();
		AddBranchButton.click();
		Emplyee.click();
		AdminButton.click();
		PowerOffDropDown.click();
		PowerOffButton.click();
	}
	
}
