package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCorporatePage 
{
	@FindBy(name = "//p[.='Add Corporate']")
	private WebElement AddCorpButton;
	
	@FindBy(name = "//h3[@class='card-title']")
	private WebElement AddCorpButtonInside;
	
	@FindBy(name = "corporate_name")
	private WebElement CorpName;
	
	@FindBy(name = "//button[.='Save']")
	private WebElement SaveButton;
	
	//Initialization
	public AddCorporatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization

	public WebElement getAddCorpButton() 
	{
		return AddCorpButton;
	}

	public WebElement getAddCorpButtonInside() 
	{
		return AddCorpButtonInside;
	}

	public WebElement getCorpName() 
	{
		return CorpName;
	}

	public WebElement getSaveButton() 
	{
		return SaveButton;
	}
	//Buisness Libraries
	public void addCorporate(String corpname)
	{
		AddCorpButton.click();
		AddCorpButtonInside.click();
		CorpName.sendKeys(corpname);
		SaveButton.click();
	}
}
