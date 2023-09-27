package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAdminPage
{
	@FindBy(xpath="//p[.='Add Admin']")
	private WebElement AddAdminButton;
	
	@FindBy(xpath="//h3[@class='card-title']")
	private WebElement AddAdmnbuttonInside;
	
	@FindBy(name = "hr_companyid")
	private WebElement CompnyId;
	
	@FindBy(name = "hr_firstname")
	private WebElement FirstName;
	
	@FindBy(name = "hr_lastname")
	private WebElement LastName;
	
	@FindBy(name="hr_middlename")
	private WebElement MiddleName;
	
	@FindBy(name = "hr_contactno")
	private WebElement CntctNmbr;
	
	@FindBy(id="hr_type")
	private WebElement HrType;
	
	@FindBy(name="hr_email")
	private WebElement Email;
	
	@FindBy(name = "hr_password")
	private WebElement Password;
	
	@FindBy(name = "//button[.='Save']")
	private WebElement SaveButton;

	//Initialization
	public AddAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getAddAdminButton() 
	{
		return AddAdminButton;
	}

	public WebElement getAddAdmnbuttonInside()
	{
		return AddAdmnbuttonInside;
	}

	public WebElement getCompnyId()
	{
		return CompnyId;
	}

	public WebElement getFirstName()
	{
		return FirstName;
	}

	public WebElement getLastName() 
	{
		return LastName;
	}

	public WebElement getMiddleName() 
	{
		return MiddleName;
	}

	public WebElement getCntctNmbr() 
	{
		return CntctNmbr;
	}

	public WebElement getHrType()
	{
		return HrType;
	}

	public WebElement getEmail() 
	{
		return Email;
	}

	public WebElement getPassword()
	{
		return Password;
	}

	public WebElement getSaveButton() 
	{
		return SaveButton;
	}
	
	//Biusness Libraries
	public void addAdmin(String cid, String fname, String lname, String mname, String cno, String email, String pwrd)
	{
		AddAdminButton.click();
		AddAdmnbuttonInside.click();
		CompnyId.sendKeys(cid);
		FirstName.sendKeys(fname);
		LastName.sendKeys(lname);
		MiddleName.sendKeys(mname);
		CntctNmbr.sendKeys(cno);
		Email.sendKeys(email);
		Password.sendKeys(pwrd);
		SaveButton.click();
	}
}
