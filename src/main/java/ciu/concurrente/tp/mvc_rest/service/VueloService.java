package ciu.concurrente.tp.mvc_rest.service;

import org.springframework.stereotype.Service;

import ciu.concurrente.tp.mvc.rest.model.Vuelo;
import ciu.concurrente.tp.mvc_rest.dbstore.Dbstore;

@Service
public class VueloService {
	
	public Vuelo getInfoVuelo(Integer idVuelo) {
		return Dbstore.getInstance().getVuelo(idVuelo);
	}
}
