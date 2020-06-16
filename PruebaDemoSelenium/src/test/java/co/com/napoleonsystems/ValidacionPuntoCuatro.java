package co.com.napoleonsystems;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidacionPuntoCuatro {
	
	
	WebDriver driver;
	
	//By username = By.id("//input[@name='user']");
	
	By username = By.xpath("//input[@name='user']");
	By password = By.xpath("//input[@name='password']");
	By login = By.xpath("//input[@class='button']");
	By java = By.xpath("//tr[2]//td[4]//input[1]");
	By ruby = By.xpath("//tr[3]//td[4]//input[1]");
	By python = By.xpath("//tr[4]//td[4]//input[1]");
	By add = By.xpath("//body/center/form[@name='f']/div[@id='available']/input[1]");
	//By totalPagar = By.id("total");
	
	//td
	//By pagarlibrojava = By.TagName("td");
	//By pagarlibrojava = By.tagName("td");
	By pagarlibrojava = By.xpath("/html[1]/body[1]/center[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]");
	//By pagarlibrojava = By.xpath("//*[@id=\"added\"]/tbody/tr[2]/td[4]");
	//By pagarlibrojava = By.cssSelector("div.d:nth-child(4) div:nth-child(2) table:nth-child(1) tbody:nth-child(1) tr:nth-child(2) > td:nth-child(4)");
	//div.d:nth-child(4) div:nth-child(2) table:nth-child(1) tbody:nth-child(1) tr:nth-child(2) > td:nth-child(4)
	//By login = By.id("//input[@class='button']");
	//@FindBy(xpath="//*[@id=\"center_column\"]/div/text()[4]")
	
	
	public void validacionpuntocuatro() throws InterruptedException {
		
		String elpago = "Rs.600";
		
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
		  
		  
		  WebElement libroJava = driver.findElement(java);
		  libroJava.clear();
		  libroJava.sendKeys("2");
		  
		  
		  WebElement libroRuby = driver.findElement(ruby);
		  libroRuby.clear();
		  libroRuby.sendKeys("5");
		  
		  WebElement libroPython = driver.findElement(python);
		  libroPython.clear();
		  libroPython.sendKeys("2");
		  
		  WebElement botonAdd = driver.findElement(add);
		  botonAdd.click();
		  
		  WebElement pagarjava = driver.findElement(pagarlibrojava);
		  Assert.assertEquals(elpago, pagarjava);
		  
		  
		  Thread.sleep(5000);
		  driver.close();
		
	}
	
}
