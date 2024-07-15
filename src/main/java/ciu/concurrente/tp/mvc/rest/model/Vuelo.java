package ciu.concurrente.tp.mvc.rest.model;

import java.util.ArrayList;
import java.util.Collection;

public class Vuelo {
	
	private Integer numeroDeVuelo;
	private Collection<Ventas>ventas;
	private Integer capacidad;
	private String fecha;
	
	
	public Vuelo(Integer nroVuelo, Integer capaci, String fech) {
		super();
		this.numeroDeVuelo = nroVuelo;
		this.capacidad = capaci;
		this.fecha = fech;
		this.ventas = new ArrayList<Ventas>();
	}
	
	
	
	public Collection<Ventas> getVentas() {
		return ventas;
	}
	
	public void agregarVenta(Ventas venta) {
		this.ventas.add(venta);
	}
	

	
	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}



	public Integer getCapacidad() {
		return capacidad;
	}



	public String getFecha() {
		return fecha;
	}



	public void terminarCompra(Integer pasajesComprados) {
		this.capacidad = this.capacidad - pasajesComprados;
	}
	
	
	
	
	
	
}
