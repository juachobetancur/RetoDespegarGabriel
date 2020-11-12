package co.com.despegar.models;

public class DatosUsuario {

	String banco, nombreFactura, apellidoFactura, documentoFactura, estado, ciudad, direccion, nombreSegundoPasejero, apellidoSegundoPasejero, documento, mail, area, celular;

	public DatosUsuario(String banco, String nombreFactura, String apellidoFactura, String documentoFactura,
			String estado, String ciudad, String direccion, String nombreSegundoPasejero,
			String apellidoSegundoPasejero, String documento, String mail, String area, String celular) {
	
		this.banco = banco;
		this.nombreFactura = nombreFactura;
		this.apellidoFactura = apellidoFactura;
		this.documentoFactura = documentoFactura;
		this.estado = estado;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.nombreSegundoPasejero = nombreSegundoPasejero;
		this.apellidoSegundoPasejero = apellidoSegundoPasejero;
		this.documento = documento;
		this.mail = mail;
		this.area = area;
		this.celular = celular;
	}

	public String getBanco() {
		return banco;
	}

	public String getNombreFactura() {
		return nombreFactura;
	}

	public String getApellidoFactura() {
		return apellidoFactura;
	}

	public String getDocumentoFactura() {
		return documentoFactura;
	}

	public String getEstado() {
		return estado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombreSegundoPasejero() {
		return nombreSegundoPasejero;
	}

	public String getApellidoSegundoPasejero() {
		return apellidoSegundoPasejero;
	}

	public String getDocumento() {
		return documento;
	}

	public String getMail() {
		return mail;
	}

	public String getArea() {
		return area;
	}

	public String getCelular() {
		return celular;
	}

	
}
