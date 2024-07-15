package ciu.concurrente.tp.mvc.rest.model;

public class Pasaje {
	private Integer idVuelo;
	
	public Pasaje(Integer nroVuelo) {
		super();
		this.idVuelo = nroVuelo;
	}
	
	public Integer getNumeroVuelo() {
		return this.idVuelo;
	}
	
	public void setNumeroVuelo(Integer vuelo) {
		this.idVuelo = vuelo;
	}
}
