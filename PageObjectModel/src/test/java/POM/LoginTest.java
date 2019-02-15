package POM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qvision.capacitacion.page.LoginPage;
import com.qvision.capacitacion.page.MainPage;

import junit.framework.Assert;


public class LoginTest {
	
	WebDriver driver;
	
	@Before
	public void cargaInicial () {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
		
		
	}
	

	@Test
	public void test() {
		LoginPage PageInicio = new LoginPage(driver);
		MainPage MP = new MainPage(driver);
		PageInicio.logueo("test", "secret");
		assertTrue("No se logro el ingreso a la pagina", MP.validarIngreso());
		MP.ingresarLibros();
		assertEquals(5050,  MP.validarTotal());
		
	}
	
	/*@After
	public void cerrar(){
		
		driver.close();
	}*/

}
