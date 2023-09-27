package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBranchPage
{
	@FindBy(xpath = "//p[text()='Add Braches']")
	private WebElement AddBranchButton;
	
	@FindBy(xpath="//h3[@class='card-title']")
	private WebElement AddBranchButtonInside;
	
	@FindBy(name = "branches_name")
	private WebElement BranchName;
	
	@FindBy(name = "//button[.='Save']")
	private WebElement SaveButton;
	
	
	//Initialization
	public AddBranchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getAddBranchButton() 
	{
		return AddBranchButton;
	}

	public WebElement getAddBranchButtonInside()
	{
		return AddBranchButtonInside;
	}

	public WebElement getBranchName()
	{
		return BranchName;
	}

	public WebElement getSaveButton() 
	{
		return SaveButton;
	}
	
	//Buisness Libraries
	public void addBranch(String bname)
	{
		AddBranchButton.click();
		AddBranchButtonInside.click();
		BranchName.sendKeys(bname);
		SaveButton.click();
	}
	
}
