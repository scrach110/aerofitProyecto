package ciu.concurrente.tp.mvc_rest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ciu.concurrente.tp.mvc.rest.model.Vuelo;
import ciu.concurrente.tp.mvc_rest.dbstore.Dbstore;
import ciu.concurrente.tp.mvc_rest.dto.CompraDTO;
import ciu.concurrente.tp.mvc_rest.service.CompraService;
import ciu.concurrente.tp.mvc_rest.service.VueloService;

@RestController
public class VueloController {
	@Autowired
	private VueloService servicioInfoVuelo;
	@Autowired
	private CompraService compraService;

	
	
	@GetMapping("/infoVuelo/{idVuelo}")
	public Vuelo getInfoVuelo(@PathVariable Integer idVuelo) {
		return this.servicioInfoVuelo.getInfoVuelo(idVuelo);
	}
	
	
	@PutMapping("/procesarCompra")	
	public synchronized String procesarCompra(@RequestBody CompraDTO compra) {
		
		return this.compraService.getCompra(compra);
		
	}

}
