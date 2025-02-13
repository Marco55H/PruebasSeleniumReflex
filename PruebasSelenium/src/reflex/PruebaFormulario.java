package reflex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebaFormulario {

	private static final String URL = "http://localhost:3000/";
	static WebDriver driver1;
	
	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
	}
	
	@Test
	void BuscarTitulo() {
		String title;		
		driver1.get(URL);		
		
		title = driver1.getTitle();		
		assertEquals(title, "Formulario de registro - Mi web");
	}
	
	@Test
	void existeCampoNombre() {
		driver1.get(URL);
		WebElement nombre = driver1.findElement(By.id("nombre"));
		
		String url = driver1.getCurrentUrl();
		assertEquals("text", nombre.getAttribute("type"));
	}
	
	@Test
	void funcionaCampoNombre() {
		driver1.get(URL);
		WebElement nombre = driver1.findElement(By.id("nombre"));
		
		nombre.sendKeys("Marquete");
		
		String url = driver1.getCurrentUrl();
	}
	
	@Test
	void existeCampoApellido() {
		driver1.get(URL);
		WebElement apellido = driver1.findElement(By.id("apellido"));
		
		String url = driver1.getCurrentUrl();
		assertEquals("text", apellido.getAttribute("type"));
	}
	
	@Test
	void funcionaCampoApellido() {
		driver1.get(URL);
		WebElement apellido = driver1.findElement(By.id("apellido"));
		
		apellido.sendKeys("Arias");
		
	}
	
	@Test
	void existenBotonesSexo() {
		driver1.get(URL);
		WebElement sexo = driver1.findElement(By.id("sexo"));
	}
	
	@Test
	void funcionaBotonesSexo() {
		driver1.get(URL);
		WebElement sexo = driver1.findElement(By.id("sexo"));
		
		sexo.click();
	}
	
	@Test
	void existeCampoEmail() {
		driver1.get(URL);
		WebElement email = driver1.findElement(By.id("email"));
		assertEquals("email", email.getAttribute("type"));
	}
	
	@Test
	void funcionaCampoEmail() {
		driver1.get(URL);
		WebElement email = driver1.findElement(By.id("email"));
		
		email.sendKeys("marco@gmail.com");		
	}
	
	void existeCheckbox1() {
		driver1.get(URL);
		WebElement checkBox = driver1.findElement(By.id("aceptar"));
	}
	
	void funcionaCheckbox1() {
		driver1.get(URL);
		WebElement checkBox = driver1.findElement(By.id("aceptar"));
		
		checkBox.click();
	}
	
	void existeCheckbox2() {
		driver1.get(URL);
		WebElement checkBox = driver1.findElement(By.id("leer"));
	}
	
	void funcionaCheckbox2() {
		driver1.get(URL);
		WebElement checkBox = driver1.findElement(By.id("leer"));
		
		checkBox.click();
	}
	
	@Test
	void existeBotonEnviar() {
		driver1.get(URL);
		WebElement botonEnviar = driver1.findElement(By.id("enviar"));
		
		String url = driver1.getCurrentUrl();
		assertEquals(URL, url);
	}

}
