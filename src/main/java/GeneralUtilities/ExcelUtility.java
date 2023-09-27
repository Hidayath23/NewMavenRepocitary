package GeneralUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.HRMProject_GenerialUtilities.IPathConstants;

public class ExcelUtility
{

	/**
	 * This method will get the data from the excel sheet
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public int getRowCount(String sheetName) throws Throwable, FileNotFoundException, IOException
	{
		Workbook workbook = WorkbookFactory.create(new FileInputStream(IPathConstants.excelProperties));
		Sheet sheet = workbook.getSheet(sheetName);
		int row = sheet.getLastRowNum();
		return row;
	}
	/**
	 * This method will fetch the data from the excel sheet
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws Throwable
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String readDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws Throwable, FileNotFoundException, IOException
	{
		Workbook workbook = WorkbookFactory.create(new FileInputStream(IPathConstants.excelProperties));
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(1);
		String data = cell.toString();
		return data;
	}
	/**
	 * This method is used to fetch the multiple data from the excel sheet
	 * @param sheetName
	 * @param keyColumn
	 * @param valueColumn
	 * @param driver
	 * @throws Throwable
	 */
	public void getMultipleDataFromExcel(String sheetName, int keyColumn, int valueColumn, WebDriver driver) throws Throwable
	{
		//Fetching the data from the excel
		FileInputStream file = new FileInputStream(IPathConstants.excelProperties);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		int count = sheet.getLastRowNum();
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0;i<-count;i++)
		{
			String key = sheet.getRow(i).getCell(keyColumn).getStringCellValue();
			String value = sheet.getRow(i).getCell(valueColumn).getStringCellValue();
			map.put(key, value);
		}
		for(Entry<String, String>s:map.entrySet())
		{
			if(s.getKey().contains("employee_companyid"))
			{
				driver.findElement(By.name(s.getKey())).sendKeys(s.getValue());
			}
		}

	}
}
