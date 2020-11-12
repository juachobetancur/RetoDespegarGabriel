package co.com.despegar.stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import co.com.despegar.models.DatosUsuario;
import co.com.despegar.models.DatosVuelo;
import co.com.despegar.steps.CompraSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraStepDefinitions {
	
	@Steps
	CompraSteps paso;


	@Given("^que estoy en el portal de Despegar$")
	public void queEstoyEnElPortalDeDespegar() {
	    paso.verificarConexionInternet();
		paso.abrirPaginaDespegar();
	}

	@When("^consulto la informacion del vuelo a comprar$")
	public void consultoLaInformacionDelVueloAComprar(List <DatosVuelo> datosVuelo) throws EncryptedDocumentException, InvalidFormatException, IOException {
		paso.ingresarLugarDeOrigen(datosVuelo.get(0).getOrigen());
		paso.ingresarLugarDeDestino(datosVuelo.get(0).getDestino());
		paso.ingresarFechaDeIda();
		paso.ingresarFechaDeRegreso();
		paso.seleccionarCantidadPasajeros();
		paso.clicEnBotonBuscar();
		paso.obtenerDatosDeIda();
	    paso.obtenerDatosDeRegreso();
	    paso.obtenerPrecioDelVuelo();
	    paso.clicEnBotonSeleccionar();
	}
	
	@When("^Registro la informacion de los personas a viajar$")
	public void registroLaInformacionDeLosPersonasAViajar(List <DatosUsuario> datosUsuario) {
	   paso.seleccionarMetodoDePagoYBanco(datosUsuario.get(0).getBanco());
	   paso.ingresarNombreFactura(datosUsuario.get(0).getNombreFactura());
	   paso.ingresarApellidoFactura(datosUsuario.get(0).getApellidoFactura());
	   paso.ingresarCedulaFactura(datosUsuario.get(0).getDocumentoFactura());
	   paso.ingresarEstado(datosUsuario.get(0).getEstado());
	   paso.ingresarCiudad(datosUsuario.get(0).getCiudad());
	   paso.ingresarDireccion(datosUsuario.get(0).getDireccion());
	   paso.ingresarNombrePrimerPasajero(datosUsuario.get(0).getNombreFactura());
	   paso.ingresarApellidoPrimerPasajero(datosUsuario.get(0).getApellidoFactura());
	   paso.ingresarCedulaPrimerPasajero(datosUsuario.get(0).getDocumentoFactura());
	   //paso.ingresarInformacionAdicionalPrimerPasajero();
	   paso.ingresarNombreSegundoPasajero(datosUsuario.get(0).getNombreSegundoPasejero());
	   paso.ingresarApellidoSegundoPasajero(datosUsuario.get(0).getApellidoSegundoPasejero());
	   paso.ingresarCedulaSegundoPasajero(datosUsuario.get(0).getDocumento());
	   //paso.ingresarInformacionAdicionalSegundoPasajero();
	   paso.ingresarMail(datosUsuario.get(0).getMail());
	   paso.ingresarConfirmacionMail(datosUsuario.get(0).getMail());
	   paso.ingresarArea(datosUsuario.get(0).getArea());
	   paso.ingresarCelular(datosUsuario.get(0).getCelular());
	   paso.clicEnTerminosYCondiciones();
	   paso.clicBotonComprarSinAsistencia();
	   
	}


	@Then("^valido que el sistema informe Instrucciones para realizar el pago$")
	public void validoQueElSistemaInformeInstruccionesParaRealizarElPago() {
	    paso.validarMensajeReservaDeCompra();
	}

}
