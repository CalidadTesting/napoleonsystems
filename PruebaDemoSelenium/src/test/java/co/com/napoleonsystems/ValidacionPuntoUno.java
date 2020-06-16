package co.com.napoleonsystems;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidacionPuntoUno {
	
	
	WebDriver driver;
	
	
	 public void validacionpuntouno() throws InterruptedException {
		 
		
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("http://sahitest.com/demo/jsPopup.htm");
		 String tituloActual = driver.getTitle();
		 String tituloExperado = "Js Popup Test";
		 AssertJUnit.assertEquals(tituloExperado, tituloActual);
		 
		 Thread.sleep(5000);
		 driver.close();
		 
		 
      }
	 
}
