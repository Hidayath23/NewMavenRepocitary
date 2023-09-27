package GeneralUtilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtilities 
{
	/**
	 * This method is used to press the enter key(Robot class)
	 * @throws Throwable
	 */
	public void enterKey() throws Throwable
	{
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to release the enter key(Robot class)
	 * @throws Throwable
	 */
	public void releaseKey() throws Throwable
	{
		Robot rbt = new Robot();
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to maximize the screen(Window)
	 * @param driver
	 */
	public static void maximizeTheBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	private String expectedurl;
	/**
	 * This method is used to minimize the window
	 * @param driver
	 */
	public void minimizeTheBrowser(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * This method is used to make the controller to wait implicitly
	 * @param driver
	 * @param duration
	 */
	public void implicitlyWait(WebDriver driver, int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	/**
	 * This method will make the controller to wait explicitly
	 * @param driver
	 * @param duration
	 * @param url
	 */
	public void explicitlyWait(WebDriver driver, int duration, String expectedurl)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.urlContains(expectedurl));
	}
	/**
	 * This method will make the controller to wait until expected url loads
	 * @param driver
	 * @param duration
	 * @param expectedurl
	 */
	public void waitUntilUrlLoads(WebDriver driver, int duration, String expectedurl)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.urlContains(expectedurl));
	}
	/**
	 * THis method will make the controller to wait until the current tittle loads on the web page
	 * @param driver
	 * @param duration
	 * @param expectedurl
	 */
	public void waitUntilTittleLoads(WebDriver driver, int duration, String expectedurl)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.titleContains(expectedurl));
	}
	/**
	 * This is a custom wait method
	 * @param element
	 * @throws Throwable
	 */
	public void customWait(WebElement element) throws Throwable
	{
		int count=0;
		while(count<10)
		{
			try
			{
				element.click();
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
			}
		}
	}
	/**
	 * This is a select by index method of select class
	 * @param element
	 * @param index
	 */
	public void selectDropDown(WebElement element, int index)
	{
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	/**
	 * This is a select by visible text method from select class
	 * @param element
	 * @param text
	 */
	public void selectDropDown( WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	/**
	 * This is a select by value method from the select class
	 * @param element
	 * @param value
	 */
	public void selectDropDown( String value,WebElement element)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	/**
	 * This is a deselect by value method from select class
	 * @param element
	 * @param value
	 */
	public void deselectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	/**
	 * This is a deselect by index method from select class
	 * @param element
	 * @param index
	 */
	public void deselectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	/**
	 * This is a deselect by visible text method from select class
	 * @param element
	 * @param ExpectedText
	 */
	public void delectByVisibleText(WebElement element, String ExpectedText)
	{
		Select select = new Select(element);
		select.deselectByVisibleText(ExpectedText);
	}
	/**
	 * This method is used to know the dropdown is multiple or not
	 * @param element
	 * @param input
	 */
	public void isMultiple(WebElement element, boolean input)
	{
		Select select = new Select(element);
		select.isMultiple();
	}
	/**
	 * This is a move to element method from actions class
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * This is a element moving method we hv to pass 'X' and 'Y' values to where it needs to move
	 * @param element
	 * @param driver
	 * @param xvalue
	 * @param yvalue
	 */
	public void contextClickOnElement(WebElement element,WebDriver driver, int xvalue, int yvalue)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element, xvalue, yvalue).perform();
	}
	/**
	 * This is a context click(right click) method from the actions class
	 * @param driver
	 * @param element
	 */
	public void mouseOveronElement(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * This is a double click method(on a single element) from actions class
	 * @param driver
	 * @param element
	 */
	public void mouseOveronelement(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	/**
	 * This is a click action class(Left Single click) from the actions class
	 * @param element
	 * @param driver
	 */
	public void mouseOverOnElement(WebElement element, WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.click(element).perform();
	}
	/**
	 * This is a click an hold method( on a single object)
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnTheElement(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.clickAndHold(element).perform();
	}
	/**
	 * This is method is used to click and hold on a single object
	 * @param element
	 * @param driver
	 */
	public void mouseOverOnTheElement(WebElement element, WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.clickAndHold(element).perform();
	}
	/**
	 * This is method is used to scroll the page, need to provide x and y axis values how much need to scroll
	 * @param driver
	 * @param xaxis
	 * @param yaxis
	 */
	public void mouseOnTheelement(WebDriver driver, int xaxis, int yaxis)
	{
		Actions action = new Actions(driver);
		action.scrollByAmount(xaxis, yaxis).perform();
	}
	/**
	 * This method used to accept alert popup
	 * @param driver
	 */
	public void acceptAlertPopup(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	/**
	 * This ethod is used to click on enter button
	 * @param driver
	 */
	public void clickOnEnterKey(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	/**
	 * This method is used to switch the frame on index basis(need to give input as index)
	 * @param driver
	 * @param index
	 */
	public void switchFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch the controller to the default(main) frame
	 * @param driver
	 */
	public void switchToMainFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to accept the alert popup
	 * @param driver
	 * @param expectedmsg
	 */
	public void acceptAlertPopup(WebDriver driver, String expectedmsg)
	{
		Alert alt=driver.switchTo().alert();
		if(alt.getText().equalsIgnoreCase(expectedmsg))
		{
			System.out.println("Alert is verified");
		}
		else
		{
			System.out.println("Alert is not verified");
		}
		alt.accept();
	}
	/**
	 * This method is used to switch the window based on Title
	 * @param driver
	 * @param expectedtittle
	 */
	public void switchWindowBasedOnTittle(WebDriver driver, String expectedtittle)
	{
		Set<String> set = driver.getWindowHandles();
		for(String str: set)
		{
			driver.switchTo().window(str);
			String tittle = driver.getTitle();
			if(tittle.contains(expectedtittle));
			{
				break;
			}
		}
	}
	/**
	 * This method is used to switch the window based on url
	 * @param driver
	 * @param expectedurl
	 */
	public void switchWindowBasedOnUrl(WebDriver driver, String expectedurl)
	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String wind = it.next();
			driver.switchTo().window(wind);
			String url = driver.getCurrentUrl();
			if(url.contains(expectedurl));
			{
				break;
			}
		}
	}
	/**
	 * This method is used to take the screenshot
	 * @param driver
	 * @param screenShotName
	 * @return
	 */
	public String takeScreenShot(WebDriver driver, String screenShotName)
	{
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenShots"+screenShotName+".png");
		try
		{
			Files.copy(src,dst);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return screenShotName;
	}
	/**
	 * This method is used to scrollTo to the particular element
	 * @param driver
	 * @param element
	 */
	public void scrollToPerticularElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	/**
	 * This method will helps to select the dropdown by visible text
	 * @param element
	 * @param text
	 */
    public void selectByVisibleText(WebElement element, String text)
    {
    	Select select = new Select(element);
    	select.selectByVisibleText(text);
    }
    /**
     * This method will handle the okay button popup
     * @param driver
     */
    public void okayButton(WebDriver driver)
    {
		try
		{
			driver.findElement(By.xpath("//input[text()='OK']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
    }
}
