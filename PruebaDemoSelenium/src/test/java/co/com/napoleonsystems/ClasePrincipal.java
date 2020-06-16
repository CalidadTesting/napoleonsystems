package co.com.napoleonsystems;

import co.com.napoleonsystems.ClasePrincipal;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ClasePrincipal {
	
	WebDriver driver;
	
  @Test(priority=0)
  public void ingresaralapagina() throws InterruptedException  {
		  
	  IngresarPagina ingresar = new IngresarPagina();
	  ingresar.ingresarpagina();
	  
  }

  @Test(priority=1)
  public void pruebauno() throws InterruptedException  {
		  
	  ValidacionPuntoUno validarnombre = new ValidacionPuntoUno();
	  validarnombre.validacionpuntouno();
	  
  }
  
  
  @Test(priority=2)
  public void pruebados() throws InterruptedException  {
		  
	  ValidacionPuntoDos validarerror = new ValidacionPuntoDos();
	  validarerror.validacionpuntodos();
	  
	  
  }
  
  @Test(priority=3)
  public void pruebatres() throws InterruptedException  {
		  
	  ValidacionPuntoTres validaIngreso = new ValidacionPuntoTres();
	  validaIngreso.validacionpuntotres();
	  
	  
  }
  
  
  @Test(priority=4)
  public void pruebacuatro() throws InterruptedException  {
		  
	  ValidacionPuntoCuatro validaCompra = new ValidacionPuntoCuatro();
	  validaCompra.validacionpuntocuatro();
	  
	  
  }
  
  
  @Test(priority=5)
  public void pruebacinco() throws InterruptedException  {
		  
	  ValidacionPuntoCinco iryvolver = new ValidacionPuntoCinco();
	  iryvolver.validacionpuntocinco();
	  
	  
  }
  

  
  
}
