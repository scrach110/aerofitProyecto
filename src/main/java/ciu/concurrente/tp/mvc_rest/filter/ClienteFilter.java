package ciu.concurrente.tp.mvc_rest.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class ClienteFilter implements Filter {
	@Autowired
	private Monitor monitor;
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("Paso 1"); // ANTES CONTROLLER, ACA SE HACE LO DE LOS 5 HILOS
		
		System.out.println(((HttpServletRequest)request).getPathInfo()); 
		
		this.monitor.ingresar(request);
		
		chain.doFilter(request, response);
		
		System.out.println("Paso 2"); // DESPUES CONTROLLER, ACA TERMINA EL HILO,POR ENDE SE PUEDE LIBERAR UN HILO	
//		this.monitor.filtrar(request);
		
		this.monitor.liberar(response);
	}

}
