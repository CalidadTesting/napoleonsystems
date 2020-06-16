package co.com.napoleonsystems;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ValidacionPuntoTres {
	
	
	WebDriver driver;
	
	By username = By.xpath("//input[@name='user']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@class='button']");
	By mensajeIngresar = By.xpath("//h2[contains(text(),'All available books')]");
	
	
	
	
	public void validacionpuntotres() throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://sahitest.com/demo/training/login.htm");
		  
		  WebElement usuario = driver.findElement(username);
		  usuario.clear();
		  usuario.sendKeys("test");
		  
		  WebElement clave = driver.findElement(password);
		  clave.clear();
		  clave.sendKeys("secret");
		  
		  
		  WebElement botonLogin = driver.findElement(login);
		  botonLogin.click();
		  
		  WebElement leerMensaje = driver.findElement(mensajeIngresar);
		  Assert.assertEquals(true, leerMensaje.isDisplayed());
		  
		  Thread.sleep(5000);
		  driver.close();
		
	}
	

}
