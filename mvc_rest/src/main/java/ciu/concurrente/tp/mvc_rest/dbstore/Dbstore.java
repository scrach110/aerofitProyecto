package ciu.concurrente.tp.mvc_rest.dbstore;

import java.util.ArrayList;
import java.util.Collection;

import ciu.concurrente.tp.mvc.rest.model.Vuelo;

public class Dbstore {
	
	private static Dbstore instance;
	private Collection<Vuelo>vuelos;
	
	
	private Dbstore() {
		this.vuelos = new ArrayList<Vuelo>();
		this.vuelos.add(new Vuelo(2001,100,"10,05/2001"));
		this.vuelos.add(new Vuelo(2313,15,"05,06/2024"));
		this.vuelos.add(new Vuelo(69, 14, "07/03/2024"));
		
	}
	
	public static Dbstore getInstance() {
		if(instance == null) {
			instance = new Dbstore();
		}
		return instance;
	}
	
	public Vuelo getVuelo(Integer idVuelo) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getNumeroDeVuelo().equals(idVuelo)) {
            return vuelo;
        }
    }
			return null;
	}
}
