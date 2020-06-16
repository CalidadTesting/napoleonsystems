package co.com.napoleonsystems;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidacionPuntoCinco {
	
	WebDriver driver;
	
	By regresarBack = By.linkText("Back");
	
	By linkTest = By.linkText("Link Test");
	By linkTestBack = By.linkText("Back");
	
	By FormTest = By.linkText("Form Test");
	By FormTestBack = By.linkText("Back");
	
	By tableTest = By.linkText("Table Test");
	By tableTestBack = By.linkText("Back");
	
	By selectTest = By.linkText("Select Test");
	
	By framesTest = By.linkText("Frames Test");
	
	By iframesTest = By.linkText("IFrames Test");
	
	By shadowRootTest = By.linkText("ShadowRoot Test");
	
	By windowOpenTest = By.linkText("Window Open Test");
	
	By WindowOpenTestWithTitle = By.linkText("Window Open Test With Title");
	
	By showModalTest = By.linkText("Show Modal Test");
	
	By spanandDivPage = By.linkText("Span and Div Page");
	
	By elementOnTopTest = By.linkText("Element On Top Test");
	
	By takePageScreenshotTest = By.linkText("TakePageScreenshot Test");
	
	By labelPage = By.linkText("Label Page");
	By labelPageBack = By.linkText("Back");
	
	By headingsTest = By.linkText("Headings Test");
	
	By visibleTest = By.linkText("Visible Test");
	
	By strictVisibleTest = By.linkText("Strict Visible Test");
	
	By containTest = By.linkText("Contain Test");
	By containTestBack = By.linkText("Back");
	
	By reactTest = By.linkText("React Test");
	
	By alertTest = By.linkText("Alert Test");
	By alertTestBack = By.linkText("Back");
	
	By confirmPage = By.linkText("Confirm Page");
	By confirmPageBack = By.linkText("Back");
	
	By promptPage = By.linkText("Prompt Page");
	By promptPageBack = By.linkText("Back");
	
	By saveAsTest = By.linkText("Save As Test");
	By saveAsTestBack = By.linkText("Back");
	
	By fileUploadTest = By.linkText("File Upload Test");
	
	public void validacionpuntocinco() throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://sahitest.com/demo/jsPopup.htm");
		  WebElement linkback = driver.findElement(regresarBack);
		  linkback.click();
		  
		  WebElement linktest = driver.findElement(linkTest);
		  linktest.click();
		  WebElement linktestback = driver.findElement(linkTestBack);
		  linktestback.click();
		  
		  WebElement formtest = driver.findElement(FormTest);
		  formtest.click();
		  Thread.sleep(3000);
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  WebElement formtestback = driver.findElement(FormTestBack);
		  formtestback.click();
		  
		  WebElement tabletest = driver.findElement(tableTest);
		  tabletest.click();
		  WebElement tabletestback = driver.findElement(tableTestBack);
		  tabletestback.click();
		  
		  WebElement selecttest = driver.findElement(selectTest);
		  selecttest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  
		  WebElement framestest = driver.findElement(framesTest);
		  framestest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement iframestest = driver.findElement(iframesTest);
		  iframestest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement shadowroottest = driver.findElement(shadowRootTest);
		  shadowroottest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement windowopentest = driver.findElement(windowOpenTest);
		  windowopentest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement Windowopentestwithtitle = driver.findElement(WindowOpenTestWithTitle);
		  Windowopentestwithtitle.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement showmodaltest = driver.findElement(showModalTest);
		  showmodaltest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement spananddivpage = driver.findElement(spanandDivPage);
		  spananddivpage.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement elementontoptest = driver.findElement(elementOnTopTest);
		  elementontoptest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement takepagescreenshottest = driver.findElement(takePageScreenshotTest);
		  takepagescreenshottest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement labelpage = driver.findElement(labelPage);
		  labelpage.click();
		  WebElement labelpageback = driver.findElement(linkTestBack);
		  labelpageback.click();
		  
		  WebElement headingstest = driver.findElement(headingsTest);
		  headingstest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement visibletest = driver.findElement(visibleTest);
		  visibletest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement strictvisibletest = driver.findElement(strictVisibleTest);
		  strictvisibletest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement containttest = driver.findElement(containTest);
		  containttest.click();
		  WebElement containttestback = driver.findElement(containTestBack);
		  containttestback.click();
		  
		  WebElement reacttest = driver.findElement(reactTest);
		  reacttest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  WebElement alerttest = driver.findElement(alertTest);
		  alerttest.click();
		  WebElement alerttestback = driver.findElement(alertTestBack);
		  alerttestback.click();
		  
		  WebElement confirmpage = driver.findElement(confirmPage);
		  confirmpage.click();
		  WebElement confirmpageback = driver.findElement(confirmPageBack);
		  confirmpageback.click();
		  
		  WebElement promptpage = driver.findElement(promptPage);
		  promptpage.click();
		  WebElement promptpageback = driver.findElement(promptPageBack);
		  promptpageback.click();
		  
		  WebElement saveastest = driver.findElement(saveAsTest);
		  saveastest.click();
		  WebElement saveastestback = driver.findElement(saveAsTestBack);
		  saveastestback.click();
		  
		  WebElement fileuploadtest = driver.findElement(fileUploadTest);
		  fileuploadtest.click();
		  driver.get("http://sahitest.com/demo/index.htm");
		  
		  Thread.sleep(5000);
		  driver.close();
		  
		  
	}

}
