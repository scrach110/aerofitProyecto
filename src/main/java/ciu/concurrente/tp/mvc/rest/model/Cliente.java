package ciu.concurrente.tp.mvc.rest.model;

import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
	private String nombreApellido;
	private Collection<Pasaje>pasajes;
	
	public Cliente(String nomApe) {
		this.nombreApellido = nomApe;
		this.pasajes = new ArrayList<Pasaje>();
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public Collection<Pasaje> getPasajes() {
		return pasajes;
	}

	public void agregarPasaje(Pasaje pasaje) {
		this.pasajes.add(pasaje);
	}
	
	public Integer cantPasajes(Integer idPasaje) {
		Integer idVuelo = null;
		for (Pasaje pasaje : pasajes) {
			if(pasaje.getNumeroVuelo() == idPasaje) {
				idVuelo = pasaje.getNumeroVuelo();
			}
		}
		return idVuelo;
	
	}

}
