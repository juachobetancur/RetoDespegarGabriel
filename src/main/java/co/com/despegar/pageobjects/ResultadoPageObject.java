package co.com.despegar.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class ResultadoPageObject extends PageObject {

	By tipoVueloIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/div[1]/span[1]/span[1]/route-info-item[2]/span[1]/span[1]/span[1]");
	By txtOrigenIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/div[1]/span[2]/span[1]/route-info-item[1]/span[1]/airport-item[1]/span[1]");
	By txtDestinoIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/div[1]/span[2]/span[2]/route-info-item[1]/span[1]/airport-item[1]/span[1]");
	By txtAeroliniaIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[1]/itinerary-element[2]/span[1]/itinerary-element-airline[1]/span[1]/span[1]/span[1]/span[1]/span[2]/span[1]");
	By txtHoraSalidaIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[2]/itinerary-element[1]/span[1]/span[1]/span[1]");
	By txtEscalasIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[2]/itinerary-element[2]/span[1]/stops-count-item[1]/span[1]/span[1]/span[1]");
	By txtHoraLledaIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[3]/itinerary-element[1]/span[1]/span[1]/span[1]/span[1]");
	By txtTotalHorasIda = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[1]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[3]/itinerary-element[2]/span[1]/duration-item[1]/span[1]/span[1]");
	By TipoVueloRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/div[1]/span[1]/span[1]/route-info-item[2]/span[1]/span[1]/span[1]");
	By txtOrigenRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/div[1]/span[2]/span[1]/route-info-item[1]/span[1]/airport-item[1]/span[1]");
	By txtDestinoRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/div[1]/span[2]/span[2]/route-info-item[1]/span[1]/airport-item[1]/span[1]");
	By txtAeroliniaRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[1]/itinerary-element[2]/span[1]/itinerary-element-airline[1]/span[1]/span[1]/span[1]/span[1]/span[2]/span[1]");
	By txtHoraSalidaRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[2]/itinerary-element[1]/span[1]/span[1]/span[1]");
	By txtEscalasRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[2]/itinerary-element[2]/span[1]/stops-count-item[1]/span[1]/span[1]/span[1]");
	By txtHoraLledaRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[3]/itinerary-element[1]/span[1]/span[1]/span[1]/span[1]");
	By txtTotalHorasRegreso = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/span[2]/route-choice[1]/ul[1]/li[1]/route[1]/itinerary[1]/div[1]/div[1]/div[3]/itinerary-element[2]/span[1]/duration-item[1]/span[1]/span[1]");

	By txtPrecioxAdulto = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/main-fare[1]/span[1]/span[2]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]");
	By txtCantidadAdultos = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/fare-details-items[1]/div[1]/span[1]/item-fare[1]/p[1]/em[1]");
	By txtValorxAdultos = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/fare-details-items[1]/div[1]/span[1]/item-fare[1]/p[1]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]");
	By txtImpYTasas = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/fare-details-items[1]/div[1]/span[1]/item-fare[2]/p[1]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]");
	By txtCargos = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/fare-details-items[1]/div[1]/span[1]/item-fare[3]/p[1]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]");
	By txtPrecioFinal = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/fare-details-items[1]/div[1]/item-fare[1]/p[1]/span[1]/flights-price[1]/span[1]/flights-price-element[1]/span[1]/span[1]/em[1]/span[2]");

	By btnSeleccionar = By.xpath(
			"//body/div[@id='flights-container-wrapper']/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/app-root[1]/app-common[1]/items[1]/div[1]/span[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/div[2]/buy-button[1]/a[1]/div[1]/em[1]");

	String getTipoVueloIda = null;
	String getOrigenIda = null;
	String getDestinoIda = null;
	String getAerolinaIda = null;
	String getHoraSalidaIda = null;
	String getEscalasIda = null;
	String getHoraLlegadaIda = null;
	String getTotalHorasIda = null;

	String getTipoVueloDeRegreso = null;
	String getOrigenRegreso = null;
	String getDestinoRegreso = null;
	String getAerolinaRegreso = null;
	String getHoraSalidaRegreso = null;
	String getEscalasRegreso = null;
	String getHoraLlegadaRegreso = null;
	String getTotalHorasRegreso = null;

	String getPrecioxAdulto = null;
	String getCantidadAdultos = null;
	String getValorxAdultos = null;
	String getImpYTasas = null;
	String getCargos = null;
	String getPrecioFinal = null;

	public void esperaExplicitaEnNuevaPagina() {
		WebDriverWait espera = new WebDriverWait(getDriver(), 30);
		espera.until(ExpectedConditions.elementToBeClickable(btnSeleccionar));
	}

	// Captura de datos de ida
	public String obtenerTipoDeVueloIda() {
		getTipoVueloIda = getDriver().findElement(tipoVueloIda).getText();
		return getTipoVueloIda;
	}

	public String obtenerTipoDeVueloIdaTextoOrigen() {
		getOrigenIda = getDriver().findElement(txtOrigenIda).getText();
		return getOrigenIda;
	}

	public String obtenerTipoDeVueloIdaTextoDestino() {
		getDestinoIda = getDriver().findElement(txtDestinoIda).getText();
		return getDestinoIda;
	}

	public String obtenerAeroliniaIda() {
		getAerolinaIda = getDriver().findElement(txtAeroliniaIda).getText();
		return getAerolinaIda;
	}

	public String obtenerHoraDeSalidaIda() {
		getHoraSalidaIda = getDriver().findElement(txtHoraSalidaIda).getText();
		return getHoraSalidaIda;
	}

	public String obtenerEscalasIda() {
		getEscalasIda = getDriver().findElement(txtEscalasIda).getText();
		return getEscalasIda;
	}

	public String obtenerHoraDeLlegadaIda() {
		getHoraLlegadaIda = getDriver().findElement(txtHoraLledaIda).getText();
		return getHoraLlegadaIda;
	}

	public String obtenerTotalHorasIda() {
		getTotalHorasIda = getDriver().findElement(txtTotalHorasIda).getText();
		return getTotalHorasIda;
	}

	// Captura de datos de regreso
	public String obtenerTipoDeVueloRegreso() {
		getTipoVueloDeRegreso = getDriver().findElement(TipoVueloRegreso).getText();
		return getTipoVueloDeRegreso;
	}

	public String obtenerTipoDeVueloRegresoTextoOrigen() {
		getOrigenRegreso = getDriver().findElement(txtOrigenRegreso).getText();
		return getOrigenRegreso;
	}

	public String obtenerTipoDeVueloRegresoTextoDestino() {
		getDestinoRegreso = getDriver().findElement(txtDestinoRegreso).getText();
		return getDestinoRegreso;
	}

	public String obtenerAeroliniaRegreso() {
		getAerolinaRegreso = getDriver().findElement(txtAeroliniaRegreso).getText();
		return getAerolinaRegreso;
	}

	public String obtenerHoraDeSalidaRegreso() {
		getHoraSalidaRegreso = getDriver().findElement(txtHoraSalidaRegreso).getText();
		return getHoraSalidaRegreso;
	}

	public String obtenerEscalasRegreso() {
		getEscalasRegreso = getDriver().findElement(txtEscalasRegreso).getText();
		return getEscalasRegreso;
	}

	public String obtenerHoraDeLlegadaRegreso() {
		getHoraLlegadaRegreso = getDriver().findElement(txtHoraLledaRegreso).getText();
		return getHoraLlegadaRegreso;
	}

	public String obtenerTotalHorasRegreso() {
		getTotalHorasRegreso = getDriver().findElement(txtTotalHorasRegreso).getText();
		return getTotalHorasRegreso;
	}

	public void clicEnBotonSeleccionar() {
		getDriver().findElement(btnSeleccionar).click();
	}

	// Obtener precio del vuelo
	public String obtenerPrecioPorAdulto() {
		getPrecioxAdulto = getDriver().findElement(txtPrecioxAdulto).getText();
		return getPrecioxAdulto;
	}

	public String obtenerCantidadAdultos() {
		getCantidadAdultos = getDriver().findElement(txtCantidadAdultos).getText();
		return getCantidadAdultos;
	}

	public String obtenerValorTotalPorAdultos() {
		getValorxAdultos = getDriver().findElement(txtValorxAdultos).getText();
		return getValorxAdultos;
	}

	public String obtenerImpuestosYTasas() {
		getImpYTasas = getDriver().findElement(txtImpYTasas).getText();
		return getImpYTasas;
	}

	public String obtenerCargos() {
		getCargos = getDriver().findElement(txtCargos).getText();
		return getCargos;
	}

	public String obtenerPrecioFinal() {
		getPrecioFinal = getDriver().findElement(txtPrecioFinal).getText();
		return getPrecioFinal;
	}

}
