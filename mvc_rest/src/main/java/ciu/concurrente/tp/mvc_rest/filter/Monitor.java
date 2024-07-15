package ciu.concurrente.tp.mvc_rest.filter;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.stereotype.Component;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

// PREGUNTAR ARIEL EL LUNES DE ESTE FILTER, Y COMO INSTANCIAR LOS VUELOS
@Component
public class Monitor {
	
	private Integer cantidadHilos;
	
	private Lock lock;
	private Condition esperandoActivarse;
	
	
	public Monitor() {
		this.lock = new ReentrantLock();
		this.esperandoActivarse = this.lock.newCondition();
		
		this.cantidadHilos = 0;
	}
	
	public void ingresar(ServletRequest request) {
		this.lock.lock();
		try {
		while(this.cantidadHilos >= 5) {
			
			this.esperandoActivarse.await();
		}
			this.cantidadHilos++;
		}
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.lock.unlock();
	}
	
	public void liberar(ServletResponse response) {
		this.lock.lock();
		this.cantidadHilos--;
		this.esperandoActivarse.signal();
		this.lock.unlock();
	}
	
}
