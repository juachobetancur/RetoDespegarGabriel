package co.com.despegar.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/")
public class CompraPageObject extends PageObject {

	
	By txtOrigen = By.xpath(
			"//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By listOrigen = By.xpath("/html/body/div[10]/div/div[1]/ul/li[1]/span");
	By txtDestino = By.xpath(
			"//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By listDestino = By.xpath("/html/body/div[10]/div/div[1]/ul/li/span");
	By listFechaIda = By
			.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input[1]");
	By listFechaIdaDia = By.xpath("//body/div[4]/div[1]/div[5]/div[1]/div[4]/span[30]/span[1]");
	By listFechaRegreso = By
			.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/input[1]");
	By listFechaRegresoDia = By.xpath("//body/div[4]/div[1]/div[5]/div[2]/div[4]/span[8]");
	By listPasajero = By.xpath(
			"//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[7]/div[1]/div[1]/div[1]/div[2]/input[1]");
	By btnCantidadPasajero = By
			.xpath("//body/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]");
	By btnBuscar = By.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/a[1]/em[1]");

	public void ingresarOrigen(String origen) {
		getDriver().findElement(txtOrigen).clear();
		getDriver().findElement(txtOrigen).sendKeys(origen);
		getDriver().findElement(listOrigen).click();
	}

	public void ingresarDestino(String destino) {
		getDriver().findElement(txtDestino).sendKeys(destino);
		getDriver().findElement(listDestino).click();
	}

	public void seleccionarFechaIda() {
		getDriver().findElement(listFechaIda).click();
		getDriver().findElement(listFechaIdaDia).click();
	}
	
	public void seleccionarFechaRegreso() {
		getDriver().findElement(listFechaRegreso).click();
		getDriver().findElement(listFechaRegresoDia).click();
	}
	
	public void seleccionarCantidadPasajeros() {
		getDriver().findElement(listPasajero).click();
		getDriver().findElement(btnCantidadPasajero).click();
	}
	
	public void darClicEnBuscar () {
		getDriver().findElement(btnBuscar).click();
	}
}
