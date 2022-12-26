package metodos;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.factory.DriversFactory;

public class Metodos extends DriversFactory {
	
	public void preencher(By elemento, String texto, String passo) {
		
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("*** Erro ao preencher " + passo + " *** " );
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem do erro" + e.getMessage());
		}
		
	}
	
	public void clicar(By elemento, String passo) {
		
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("*** Erro ao clicar " + passo + " *** " );
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem do erro" + e.getMessage());
		}
		
	}
	
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+n1+","+n2+")");
	}
	
	public void evidencias(String evidencia) {
		TakesScreenshot srcShot = (TakesScreenshot) driver; // camera
		File srcFile  = srcShot.getScreenshotAs(OutputType.FILE); //tirar o arquivo
		File srcDest = new File("./evidencia/"+evidencia+".png"); //preparar o diretorio
		try {
			FileUtils.copyFile(srcFile, srcDest);
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Falha ao executar o teste");
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
		
	}
	
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	public void esperarElemento(By elemento) {
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(elemento));
		
	}

}
