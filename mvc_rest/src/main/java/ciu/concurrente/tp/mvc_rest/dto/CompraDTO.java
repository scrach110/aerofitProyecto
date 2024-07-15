package ciu.concurrente.tp.mvc_rest.dto;



public class CompraDTO {
	
	public Integer idVuelo;
	public String nombreApellido;
	public Integer cantidadPasajes;
	
	public CompraDTO(Integer id, String nombreApe, Integer cantidad) {
		this.cantidadPasajes = cantidad;
		this.idVuelo = id;
		this.nombreApellido = nombreApe;
	}

	public Integer idVuelo() {
		return idVuelo;
	}


	public String nombreApellido() {
		return nombreApellido;
	}


	public Integer cantidadPasajes() {
		return cantidadPasajes;
	}


	
}