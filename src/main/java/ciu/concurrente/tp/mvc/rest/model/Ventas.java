package ciu.concurrente.tp.mvc.rest.model;

public class Ventas {
	
	private Integer idVuelo;
	private Cliente cliente;
	
	
	public Ventas(Integer id, Cliente clie) {
		super();
		this.cliente = clie;
		this.idVuelo = id;
	}


	public Integer getIdVuelo() {
		return idVuelo;
	}


	public Cliente getCliente() {
		return cliente;
	}
	
	
}
