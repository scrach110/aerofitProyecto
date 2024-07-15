package ciu.concurrente.tp.mvc_rest.service;

import org.springframework.stereotype.Service;

import ciu.concurrente.tp.mvc.rest.model.Cliente;
import ciu.concurrente.tp.mvc.rest.model.Pasaje;
import ciu.concurrente.tp.mvc.rest.model.Vuelo;
import ciu.concurrente.tp.mvc_rest.dbstore.Dbstore;
import ciu.concurrente.tp.mvc_rest.dto.CompraDTO;
import ciu.concurrente.tp.mvc.rest.model.Ventas;

@Service
public class CompraService {
	
	public String getCompra(CompraDTO compra) {
		Vuelo vuelo = Dbstore.getInstance().getVuelo(compra.idVuelo());
		Cliente cliente = new Cliente(compra.nombreApellido());
		Ventas venta = new Ventas(compra.idVuelo(), cliente);
		Pasaje pasaje = new Pasaje(compra.idVuelo());
		
		if((vuelo.getCapacidad() - compra.cantidadPasajes()) < 0) {
			return "La compra no es valida, capacidad insuficiente.";
		}
		else {
			
			vuelo.terminarCompra(compra.cantidadPasajes());
			vuelo.agregarVenta(venta);
			cliente.agregarPasaje(pasaje);
			
			return "La compra se ha procesado con exito";
			
		}
	}
}
