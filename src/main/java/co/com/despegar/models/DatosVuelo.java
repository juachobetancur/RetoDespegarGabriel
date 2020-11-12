package co.com.despegar.models;

public class DatosVuelo {

	String origen, destino, salida, regreso, pasajeros;

	public DatosVuelo(String origen, String destino, String salida, String regreso, String pasajeros) {
		
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.regreso = regreso;
		this.pasajeros = pasajeros;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public String getSalida() {
		return salida;
	}

	public String getRegreso() {
		return regreso;
	}

	public String getPasajeros() {
		return pasajeros;
	}

	

}
