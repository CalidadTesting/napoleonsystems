package co.com.napoleonsystems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IngresarPagina {
	
	WebDriver driver;
	
	
	public void ingresarpagina() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://sahitest.com/demo/jsPopup.htm");
		 
		  Thread.sleep(5000);
		  driver.close();
		  
		  
	}

}
