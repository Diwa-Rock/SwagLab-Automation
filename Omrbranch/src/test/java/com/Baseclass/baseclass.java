package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
    public static  WebDriver driver;
    public  static void browserLaunch() {
    	driver=new ChromeDriver();
    }
    public static void enterUrl(String url) {
    	driver.get(url);
    }
    public static void maximizeWindow() {
    	driver.manage().window().maximize();
    }
    public static String getProjectPath() {
    	String path=System.getProperty("user.dir");
		return path;
    	
    }
    public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
    	Properties properties=new Properties();

    	properties.load(new FileInputStream (getProjectPath()+"\\Config\\config.properties"));
    	Object object=properties.get(key);
    	String value=(String)object;
		return value;
    }
    public void getDriver(String browserType) {
    	switch (browserType) {
		case "Chrome":
			driver=new ChromeDriver();
			break;
		case "Firefox":
			driver=new FirefoxDriver();
			break;
		case "IE":
			driver=new InternetExplorerDriver();
			break;
		case "Edge":
			driver=new EdgeDriver();
			break;
        default:
			break;
		}
    }
    public static void elementSendkeys(WebElement element,String data) {
    	element.sendKeys(data);
    }
    public static void elementSendkeysEnter(WebElement element, String data) {
    	element.sendKeys(data,Keys.ENTER);
    }
    public static void elementClick(WebElement element) {
    	element.click();
    }
    public String getTitle() {
    	String title = driver.getTitle();
    	return title;
    }
    public String getApplnUrl() {
    	String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }
    public WebElement findLocatorById(String attributevalue) {
    	WebElement element = driver.findElement(By.id(attributevalue));
    	return element;
    }
    public WebElement findLocatorByName(String attributevalue) {
    	WebElement element = driver.findElement(By.name(attributevalue));
    	return element;
    }
    public WebElement findLocatorByClassName(String attributevalue) {
    	WebElement element = driver.findElement(By.className(attributevalue));
    	return element;
    }
    public static WebElement findLbyXpath(String xpath) {
    	WebElement element = driver.findElement(By.xpath(xpath));
    	return element;
    	
    }
    public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String elementGetAttribute(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	// Alert
	public void alertOkAccept() {
		driver.switchTo().alert().accept();
	}

	public void alertCencelDismiss() {
		driver.switchTo().alert().dismiss();
	}

	// close window
	public static void quitWindow() {
		driver.quit();
	}

	public void closeWindow() {
		driver.close();
	}

	// DropDown Select
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void isMultible(WebElement element) {
		Select select = new Select(element);
		select.isMultiple();
	}

	public void getFistSelectedOption(WebElement element) {
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}

	public void getAllSelectedOption(WebElement element) {
		Select select = new Select(element);
		select.getAllSelectedOptions();
	}

	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deselectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}

	// Action
	// Actions actions = new Actions(driver);

	public void mouseToOverActiom(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void contextClick() {
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}

	public void actionKeyDown() {
		// TODO Auto-generated method stub

	}

	public void actionKeyUp() {
		// TODO Auto-generated method stub

	}

	// javaScriptExecutor
	public void javaScriptExecutorValue(WebElement element,String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttributevalue('value','" + data + "')", element);
	}

	public void javaScriptClik(WebElement element,String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].Click", element);
	}

	public void javaScriptSrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(false)", element);
	}

	public void javaScriptSrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(true)", element);
	}

	public WebElement add(String value) {
		WebElement findElement = driver.findElement(By.id("value"));
		return findElement;
	}

	// Robot
	public void robotKeyPress(int args) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(args);
	}

	public void robotKeyRelease(int args) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(args);
	}
	// TakesScreenshot page

	public void takesScreenshot(String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\gopika\\Desktop\\Esai- Java\\ss\\" + name + ".png");
		FileUtils.copyFile(screenshotAs, file);
	}

	public void takesScreenshotElement(WebElement element,String name1) throws IOException {
		//TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\gopika\\Desktop\\Esai- Java\\ss\\"+name1+".png");
		FileUtils.copyFile(screenshotAs, file);
	}

	public void windowsHandle() {

	}

	// Navigate
	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	// wait
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	// WebHandles
	public void switchChildWindow() {

		String Parentwindows = driver.getWindowHandle();

	}

	public static String readExcelData(String SheetName, int rowNum, int cellNum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\gopika\\eclipse-workspace\\Newprojcucu\\Excel\\login details.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType cellType = cell.getCellType();

		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
				res = dateFormat.format(dateCellValue);
			} else {
				long numericCellValue = (long) cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(numericCellValue);
				res = String.valueOf(b);

				// double numericCellValue = cell.getNumericCellValue();
				// long check = Math.round(numericCellValue);
				// if (numericCellValue == check) {
				// res = String.valueOf(numericCellValue);
			}

		}
		return res;
		// break;
		// default:
		// break;
	}
	// return res;

	// }

	public void writeExcel(String SheetName, int rowNum, int cellNum, String name) throws IOException {
		File file = new File("C:\\Users\\gopika\\eclipse-workspace\\Fwcnew\\Excel\\login details.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		CellType type = cell.getCellType();
		cell.setCellValue(name);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

	public void updateExcel(String SheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File("C:\\Users\\gopika\\eclipse-workspace\\Fwcnew\\Excel\\login details.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}

		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

    
}
