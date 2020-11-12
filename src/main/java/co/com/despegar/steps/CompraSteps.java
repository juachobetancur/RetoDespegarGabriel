package co.com.despegar.steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.com.despegar.pageobjects.CompraPageObject;
import co.com.despegar.pageobjects.PagoPageObject;
import co.com.despegar.pageobjects.ResultadoPageObject;
import co.com.despegar.pageobjects.ValidacionViajePageObject;
import co.com.despegar.utils.ConecInternetUtils;
import co.com.despegar.utils.DatosExcelUtil;
import net.thucydides.core.annotations.Step;

public class CompraSteps {

	CompraPageObject compraPageObject = new CompraPageObject();
	ResultadoPageObject resultadoPageObject = new ResultadoPageObject();
	DatosExcelUtil datosExcel = new DatosExcelUtil();
	ConecInternetUtils estadoConexion = new ConecInternetUtils();
	PagoPageObject pagoPageObject = new PagoPageObject();
	ValidacionViajePageObject validacionViaje = new ValidacionViajePageObject();

	@Step
	public void verificarConexionInternet() {
		estadoConexion.obtenerEstadoConexion();

	}

	@Step
	public void abrirPaginaDespegar() {
		compraPageObject.open();

	}

	@Step
	public void ingresarLugarDeOrigen(String origen) {
		compraPageObject.ingresarOrigen(origen);
	}

	@Step
	public void ingresarLugarDeDestino(String destino) {
		compraPageObject.ingresarDestino(destino);
	}

	@Step
	public void ingresarFechaDeIda() {
		compraPageObject.seleccionarFechaIda();
	}

	@Step
	public void ingresarFechaDeRegreso() {
		compraPageObject.seleccionarFechaRegreso();
	}

	@Step
	public void seleccionarCantidadPasajeros() {
		compraPageObject.seleccionarCantidadPasajeros();
	}

	@Step
	public void clicEnBotonBuscar() {
		compraPageObject.darClicEnBuscar();
		resultadoPageObject.esperaExplicitaEnNuevaPagina();

	}

	@Step
	public void obtenerDatosDeIda() throws EncryptedDocumentException, InvalidFormatException, IOException {
		datosExcel.escribirEncabezado();
		datosExcel.escribirDatosVuelo(1, resultadoPageObject.obtenerTipoDeVueloIda(),
				resultadoPageObject.obtenerTipoDeVueloIdaTextoOrigen(),
				resultadoPageObject.obtenerTipoDeVueloIdaTextoDestino(), resultadoPageObject.obtenerAeroliniaIda(),
				resultadoPageObject.obtenerHoraDeSalidaIda(), resultadoPageObject.obtenerEscalasIda(),
				resultadoPageObject.obtenerHoraDeLlegadaIda(), resultadoPageObject.obtenerTotalHorasIda());

	}

	@Step
	public void obtenerDatosDeRegreso() throws EncryptedDocumentException, InvalidFormatException, IOException {
		datosExcel.escribirDatosVuelo(2, resultadoPageObject.obtenerTipoDeVueloRegreso(),
				resultadoPageObject.obtenerTipoDeVueloRegresoTextoOrigen(),
				resultadoPageObject.obtenerTipoDeVueloRegresoTextoDestino(),
				resultadoPageObject.obtenerAeroliniaRegreso(), resultadoPageObject.obtenerHoraDeSalidaRegreso(),
				resultadoPageObject.obtenerEscalasRegreso(), resultadoPageObject.obtenerHoraDeLlegadaRegreso(),
				resultadoPageObject.obtenerTotalHorasRegreso());
	}

	@Step
	public void obtenerPrecioDelVuelo() throws EncryptedDocumentException, InvalidFormatException, IOException {
		datosExcel.escribirPrecioDelVuelo(5, resultadoPageObject.obtenerPrecioPorAdulto(),
				resultadoPageObject.obtenerCantidadAdultos(), resultadoPageObject.obtenerValorTotalPorAdultos(),
				resultadoPageObject.obtenerImpuestosYTasas(), resultadoPageObject.obtenerCargos(),
				resultadoPageObject.obtenerPrecioFinal());
	}

	@Step
	public void clicEnBotonSeleccionar() {
		resultadoPageObject.clicEnBotonSeleccionar();
		pagoPageObject.esperaExplicitaEnPaginaPagos();
	}

	@Step
	public void seleccionarMetodoDePagoYBanco(String banco) {
		pagoPageObject.seleccionarMetodoDePago();
		pagoPageObject.seleccionarBanco(banco);
	}

	@Step
	public void ingresarNombreFactura(String nombreFactura) {
		pagoPageObject.ingresarNombreResponsableFactura(nombreFactura);
	}

	@Step
	public void ingresarApellidoFactura(String apellidoFactura) {
		pagoPageObject.ingresarApellidoResponsableFactura(apellidoFactura);
	}

	@Step
	public void ingresarCedulaFactura(String documentoFactura) {
		pagoPageObject.ingresarDocumentoResponsableFactura(documentoFactura);
	}

	@Step
	public void ingresarEstado(String estado) {
		pagoPageObject.ingresarDepartamento(estado);
	}

	@Step
	public void ingresarCiudad(String ciudad) {
		pagoPageObject.ingresarCiudad(ciudad);
	}

	@Step
	public void ingresarDireccion(String direccion) {
		pagoPageObject.ingresarDireccion(direccion);
	}

	@Step
	public void ingresarNombrePrimerPasajero(String nombreFactura) {
		pagoPageObject.ingresarNombrePrimerPasajero(nombreFactura);
	}

	@Step
	public void ingresarApellidoPrimerPasajero(String apellidoFactura) {
		pagoPageObject.ingresarApellidoPrimerPasajero(apellidoFactura);
	}

	@Step
	public void ingresarCedulaPrimerPasajero(String documentoFactura) {
		pagoPageObject.ingresarCedulaPrimerPasajero(documentoFactura);
	}

	@Step
	public void ingresarInformacionAdicionalPrimerPasajero() {
		pagoPageObject.ingresarInformacionAdicionalPrimerPasajero();
	}

	@Step
	public void ingresarNombreSegundoPasajero(String nombreSegundoPasejero) {
		pagoPageObject.ingresarNombreSegundoPasajero(nombreSegundoPasejero);
	}

	@Step
	public void ingresarApellidoSegundoPasajero(String apellidoSegundoPasejero) {
		pagoPageObject.ingresarApellidoSegundoPasajero(apellidoSegundoPasejero);
	}

	@Step
	public void ingresarCedulaSegundoPasajero(String documento) {
		pagoPageObject.ingresarCedulaSegundoPasajero(documento);
	}

	@Step
	public void ingresarInformacionAdicionalSegundoPasajero() {
		pagoPageObject.ingresarInformacionAdicionalSegundoPasajero();
	}

	@Step
	public void ingresarMail(String mail) {
		pagoPageObject.ingresarMail(mail);
	}

	public void ingresarConfirmacionMail(String mail) {
		pagoPageObject.ingresarConfirmacionMail(mail);
	}

	public void ingresarArea(String area) {
		pagoPageObject.ingresarArea(area);
	}

	public void ingresarCelular(String celular) {
		pagoPageObject.ingresarCelular(celular);
	}

	public void clicEnTerminosYCondiciones() {
		pagoPageObject.clicEnAceptarTerminos();
	}

	public void clicBotonComprarSinAsistencia() {
		pagoPageObject.clicEnBotonComprarSinAsistencia();
	}

	public void validarMensajeReservaDeCompra() {
		validacionViaje.validacionMensaje();
	}

}
