package co.com.despegar.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class ValidacionViajePageObject extends PageObject{

	By mensajeValidacion = By.xpath("//span[contains(.,'Instrucciones para realizar el pago')]");
	By BtnIrAPagar = By.xpath("//body/div[2]/div[1]/div[1]/app[1]/cash-published[1]/div[1]/div[3]/cash-published-info[1]/div[1]/div[1]/div[2]/div[2]/div[3]/a[1]/em[1]");
	
	public void validacionMensaje() {
		WebDriverWait espera = new WebDriverWait (getDriver(),30);
		espera.until(ExpectedConditions.elementToBeClickable(BtnIrAPagar));
		assertThat(getDriver().findElement(mensajeValidacion).isDisplayed(), Matchers.is(true));
	}
	
}
