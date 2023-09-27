package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage 
{
	@FindBy(xpath="//p[.='Add Employee']")
	private WebElement AddEmplyee;
	
	@FindBy(xpath="//h3[@class='card-title']")
	private WebElement InsideAddEmployee;
	
	@FindBy(name="employee_companyid")
	private WebElement CompnyID;
	
	@FindBy(name="employee_firstname")
	private WebElement EmpFirstName;
	
	@FindBy(name="employee_lastname")
	private WebElement EmplastName;
	
	@FindBy(name = "employee_middlename")
	private WebElement EmpMiddleName;
	
	@FindBy(name = "branches_datefrom")
	private WebElement Branchdate;
	
	@FindBy(name = "branches_recentdate")
	private WebElement BanchRcnDate;
	
	@FindBy(name = "employee_position")
	private WebElement Emppossition;
	
	@FindBy(name = "employee_contact")
	private WebElement EmpPhNo;
	
	@FindBy(name = "employee_hdmf_pagibig")
	private WebElement EmpHDMF;
	
	@FindBy(name = "employee_gsis")
	private WebElement EmpGSIS;
	
	@FindBy(name = "//button[.='Save']")
	private WebElement SaveButton;

	//Initialization
	public AddEmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getAddEmplyee() 
	{
		return AddEmplyee;
	}

	public WebElement getInsideAddEmployee()
	{
		return InsideAddEmployee;
	}

	public WebElement getCompnyID()
	{
		return CompnyID;
	}

	public WebElement getEmpFirstName() 
	{
		return EmpFirstName;
	}

	public WebElement getEmplastName()
	{
		return EmplastName;
	}

	public WebElement getEmpMiddleName() 
	{
		return EmpMiddleName;
	}

	public WebElement getBranchName() 
	{
		return Branchdate;
	}

	public WebElement getBanchRcnDate()
	{
		return BanchRcnDate;
	}

	public WebElement getEmppossition() 
	{
		return Emppossition;
	}

	public WebElement getEmpPhNo() 
	{
		return EmpPhNo;
	}

	public WebElement getEmpHDMF() 
	{
		return EmpHDMF;
	}

	public WebElement getEmpGSIS() 
	{
		return EmpGSIS;
	}

	public WebElement getSaveButton() 
	{
		return SaveButton;
	}
	public void addEmployee(String id, String Fname, String ELname, String EMname, String Bdate, String BRdate, String Possition, CharSequence[] PNo, String HdMf, String GSIS)
	{
		AddEmplyee.click();
		InsideAddEmployee.click();
		CompnyID.sendKeys(id);
		EmpFirstName.sendKeys(Fname);
		EmplastName.sendKeys(ELname);
		EmpMiddleName.sendKeys(EMname);
		Branchdate.sendKeys(Bdate);
		BanchRcnDate.sendKeys(BRdate);
		Emppossition.sendKeys(Possition);
		EmpPhNo.sendKeys(PNo);
		EmpHDMF.sendKeys(HdMf);
		EmpGSIS.sendKeys(GSIS);
		SaveButton.click();
	}
		
}