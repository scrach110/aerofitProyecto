package ciu.concurrente.tp.mvc.rest.model;

import java.util.Collection;

public class InfoVuelo {
	private Vuelo vuelo;
	
	
	public InfoVuelo(Vuelo vuelo) {
		super();
		this.vuelo = vuelo;
	}
	
	public Integer numeroDeVuelo() {
		return this.vuelo.getNumeroDeVuelo();
	}
	
	public Collection<Ventas> ventas(){
		return this.vuelo.getVentas();
	}
	
	public Integer capacidad() {
		return this.vuelo.getCapacidad();
	}
}
