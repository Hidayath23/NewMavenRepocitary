package NewPracticePackage;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyEmpAddingFromGRHEAD 
{

	public static void main(String[] args) 
	{
		Random rando = new Random();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/HRM_System/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='hr_email']")).sendKeys("hrhead@gmail.com");
		driver.findElement(By.name("hr_password")).sendKeys("hrhead@123");
		WebElement sel = driver.findElement(By.id("hr_type"));
		Select select = new Select(sel);
		select.selectByVisibleText("→ HR Head");
		driver.findElement(By.name("login_hr")).click();
		try
		{
			driver.findElement(By.xpath("//input[text()='OK']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		System.out.println("Entering into the application");
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-user']")).click();
		driver.findElement(By.xpath("//p[.='Add Employee']")).click();
		System.out.println("Entering into the add employee page successfully");
		driver.findElement(By.xpath("//h3[@class='card-title']")).click();
		driver.findElement(By.name("employee_companyid")).sendKeys("Test Yanthra"+rando);
		System.out.println("Added Company name successfully");
		driver.findElement(By.name("employee_firstname")).sendKeys("Soumithra"+rando);
		System.out.println("Added first name successfully");
		driver.findElement(By.name("employee_lastname")).sendKeys("Dhar"+rando);
		System.out.println("Added last name succesfully");
		driver.findElement(By.name("employee_middlename")).sendKeys("Soumithra"+rando);
		System.out.println("Added middlename successfulyy");
		driver.findElement(By.name("branches_datefrom")).sendKeys("08-Sep-2023"+rando);
		System.out.println("Added branchdate successfully");
		driver.findElement(By.name("branches_recentdate")).sendKeys("08-Oct-2023"+rando);
		System.out.println("Added recent date successfully");
		driver.findElement(By.name("employee_position")).sendKeys("Senior SoftWare Engineer"+rando);
		driver.findElement(By.name("employee_contact")).sendKeys("94808955434"+rando);
		driver.findElement(By.name("employee_hdmf_pagibig")).sendKeys("6357646"+rando);
		driver.findElement(By.name("employee_gsis")).sendKeys("k534hf"+rando);
		driver.findElement(By.xpath("//button[.='Save']")).click();
		System.out.println("Till save button program successfully completed");
		driver.findElement(By.xpath("//li[@class='nav-item dropdown']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-power-off']")).click();
		try
		{
			driver.findElement(By.xpath("//input[text()='OK']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		System.out.println("Successfully came back to 'Log In' Page");

	}

}
