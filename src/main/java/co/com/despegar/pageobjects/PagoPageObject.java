package co.com.despegar.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class PagoPageObject extends PageObject{
	
	By rdbPSE = By.xpath("//span[contains(.,'PSE')]");
	By txtSeleccionarBanco = By.xpath("//select[@id='card-selector-0']");
	By txtNombreFactura = By.xpath("//input[@id='invoice-first-name-0']");
	By txtApellidoFactura = By.xpath("//input[@id='invoice-last-name-0']");
	By txtDocumentoFactura = By.xpath("//input[@id='invoice-fiscal-identification-number-0']");
	By txtDepartamento = By.xpath("//select[@id='invoice-fiscal-address-state-0']");
	By txtCiudad = By.xpath("//input[@id='invoice-fiscal-address-city-CASH_TRANSFER_BOG-0']");
	By clickCiudad = By.xpath("//ul[@id='ui-id-1']");
	By txtDireccion = By.xpath("//*[contains(@class,'fiscal-address-street')]");
	By txtNombrePrimerPasajero = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/traveler[1]/div[1]/div[2]/div[1]/div[1]/traveler-first-name-input[1]/div[1]/div[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
	By txtApellidoPrimerPasajero = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/traveler[1]/div[1]/div[2]/div[1]/div[1]/traveler-last-name-input[1]/div[1]/div[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
	By txtcedulaPrimerPasajero = By.xpath("//input[@id='traveler-identification-number-0']");
	By txtDiaNacimientoPrimerPasajero = By.xpath("//select[@id='traveler-birthday-day-0']");
	By txtMesNacimientoPrimerPasajero = By.xpath("//select[@id='traveler-birthday-month-0']");
	By txtAnnioNacimientoPrimerPasajero = By.xpath("//select[@id='traveler-birthday-year-0']");
	By txtSexoPrimerPasajero = By.xpath("//body/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/traveler[1]/div[1]/div[2]/div[1]/div[3]/compound-radio-component[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]/i[1]");
	By txtNombreSegundoPasajero = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/traveler[1]/div[1]/div[2]/div[1]/div[1]/traveler-first-name-input[1]/div[1]/div[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
	By txtApellidoSegundoPasajero = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/traveler[1]/div[1]/div[2]/div[1]/div[1]/traveler-last-name-input[1]/div[1]/div[1]/input-component-v2[1]/div[1]/div[1]/div[1]/input[1]");
	By txtcedulaSegundoPasajero = By.xpath("//input[@id='traveler-identification-number-1']");
	By txtDiaNacimientoSegundoPasajero = By.xpath("//select[@id='traveler-birthday-day-1']");
	By txtMesNacimientoSegundoPasajero = By.xpath("//select[@id='traveler-birthday-month-1']");
	By txtAnnioNacimientoSegundoPasajero = By.xpath("//select[@id='traveler-birthday-year-1']");
	By txtSexoSegundoPasajero = By.xpath("//body/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/travelers[1]/div[1]/ul[1]/li[1]/ul[1]/li[2]/traveler[1]/div[1]/div[2]/div[1]/div[3]/compound-radio-component[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]/i[1]");
	By txtMail = By.xpath("//*[contains(@class,'contact-email input')]");
	By txtConfirmarMail = By.xpath("//*[contains(@class,'contact-email-repeat')]");
	By txtArea = By.xpath("//body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/contact-phone[1]/div[1]/div[1]/phones[1]/ul[1]/li[1]/phone[1]/div[1]/div[2]/div[1]/input-component-new[1]/div[1]/div[1]/input[1]");
	By txtCelular = By.xpath("//body[1]/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/contact-phone[1]/div[1]/div[1]/phones[1]/ul[1]/li[1]/phone[1]/div[1]/div[2]/div[2]/input-component-new[1]/div[1]/div[1]/input[1]");
	By rdbTerminos = By.xpath("//body/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/buy-component[1]/div[1]/agreement-component[1]/div[1]/ol[1]/li[1]/terms-checkbox-component[1]/checkbox-component[1]/span[1]/label[1]/i[1]");
	By btnComprarSinAsistencia = By.xpath("//body/div[2]/div[1]/div[1]/app[1]/checkout-form[1]/div[1]/form-component[1]/form[1]/div[1]/buy-component[1]/div[1]/div[1]/div[1]/div[1]/button-component[1]/div[1]/a[1]/em[1]");
	
	public void esperaExplicitaEnPaginaPagos() {
		WebDriverWait espera = new WebDriverWait (getDriver(),30);
		espera.until(ExpectedConditions.elementToBeClickable(rdbPSE));
	}
	
	public void seleccionarMetodoDePago() {
		getDriver().findElement(rdbPSE).click();
	}
	
	public void seleccionarBanco(String banco) {
		getDriver().findElement(txtSeleccionarBanco).sendKeys(banco);
	}
	public void ingresarNombreResponsableFactura(String nombreFactura) {
		getDriver().findElement(txtNombreFactura).sendKeys(nombreFactura);
	}
	public void ingresarApellidoResponsableFactura(String apellidoFactura) {
		getDriver().findElement(txtApellidoFactura).sendKeys(apellidoFactura);
	}
	public void ingresarDocumentoResponsableFactura(String documentoFactura) {
		getDriver().findElement(txtDocumentoFactura).sendKeys(documentoFactura);
	}
	public void ingresarDepartamento(String estado) {
		getDriver().findElement(txtDepartamento).sendKeys(estado);
	}
	public void ingresarCiudad(String ciudad) {
		getDriver().findElement(txtCiudad).sendKeys(ciudad);
		getDriver().findElement(clickCiudad).click();
	}
	public void ingresarDireccion(String direccion) {
		getDriver().findElement(txtDireccion).click();
		getDriver().findElement(txtDireccion).sendKeys(direccion);
	}
	public void ingresarNombrePrimerPasajero(String nombreFactura) {
		getDriver().findElement(txtNombrePrimerPasajero).sendKeys(nombreFactura);
	}
	public void ingresarApellidoPrimerPasajero(String apellidoFactura) {
		getDriver().findElement(txtApellidoPrimerPasajero).sendKeys(apellidoFactura);
	}
	public void ingresarCedulaPrimerPasajero(String documentoFactura) {
		getDriver().findElement(txtcedulaPrimerPasajero).sendKeys(documentoFactura);
	}
	public void ingresarInformacionAdicionalPrimerPasajero() {
		getDriver().findElement(txtDiaNacimientoPrimerPasajero).sendKeys("30");
		getDriver().findElement(txtMesNacimientoPrimerPasajero).sendKeys("1");
		getDriver().findElement(txtAnnioNacimientoPrimerPasajero).sendKeys("1986");
		getDriver().findElement(txtSexoPrimerPasajero).click();
	}
	
	public void ingresarNombreSegundoPasajero(String nombreSegundoPasejero) {
		getDriver().findElement(txtNombreSegundoPasajero).sendKeys(nombreSegundoPasejero);
	}
	public void ingresarApellidoSegundoPasajero(String apellidoSegundoPasejero) {
		getDriver().findElement(txtApellidoSegundoPasajero).sendKeys(apellidoSegundoPasejero);
	}
	public void ingresarCedulaSegundoPasajero(String documento) {
		getDriver().findElement(txtcedulaSegundoPasajero).sendKeys(documento);
	}
	public void ingresarInformacionAdicionalSegundoPasajero() {
		getDriver().findElement(txtDiaNacimientoSegundoPasajero).sendKeys("14");
		getDriver().findElement(txtMesNacimientoSegundoPasajero).sendKeys("5");
		getDriver().findElement(txtAnnioNacimientoSegundoPasajero).sendKeys("1977");
		getDriver().findElement(txtSexoSegundoPasajero).click();
	}
	public void ingresarMail(String mail) {
		getDriver().findElement(txtMail).sendKeys(mail);
	}
	public void ingresarConfirmacionMail(String mail) {
		getDriver().findElement(txtConfirmarMail).sendKeys(mail);
	}
	public void ingresarArea(String area) {
		getDriver().findElement(txtArea).sendKeys(area);
	}
	public void ingresarCelular(String celular) {
		getDriver().findElement(txtCelular).sendKeys(celular);
	}
	public void clicEnAceptarTerminos() {
		getDriver().findElement(rdbTerminos).click();
	}
	public void clicEnBotonComprarSinAsistencia() {
		getDriver().findElement(btnComprarSinAsistencia).click();
	}
	
}
