package co.com.napoleonsystems;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidacionPuntoDos {
	
	WebDriver driver;
	
	By regresarBack = By.linkText("Back");
	By errorPages = By.linkText("Error Pages");
	
	By mensajeError = By.cssSelector("body:nth-child(2) > a:nth-child(2)");
	
	public void validacionpuntodos() throws InterruptedException {
		
		      System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("http://sahitest.com/demo/jsPopup.htm");
			  WebElement linkback = driver.findElement(regresarBack);
			  linkback.click();
			  
			  WebElement clickeerrorpages = driver.findElement(errorPages);
			  clickeerrorpages.click();
			  
			  WebElement error = driver.findElement(mensajeError);
			  Assert.assertEquals(true, error.isDisplayed());
			  
			  Thread.sleep(5000);
			  driver.close();
			  
			  
			  
		  }
		
}
	


