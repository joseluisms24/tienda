package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	Tienda tienda;
	Producto p1,p2;
	
	@BeforeEach
	void setUp() throws Exception {
		tienda = new Tienda();
		p1 = new Producto("Pizza", 500);
		p2 = new Producto ("Lentejas", 600);
		
	}

	@Test
	void testAgregarProducto() {
	    tienda.agregarProducto(p1);
	    tienda.agregarProducto(p2);

	    assertEquals(2, tienda.obtenerProductos().size());
	    
	}
	
	@Test
	void testObtenerProductos() {
	    // Agregamos productos
	    tienda.agregarProducto(p1);
	    tienda.agregarProducto(p2);

	    // Verificamos que la lista devuelta contenga exactamente esos productos
	    assertEquals(2, tienda.obtenerProductos().size());
	    assertTrue(tienda.obtenerProductos().contains(p1));
	    assertTrue(tienda.obtenerProductos().contains(p2));
	}
	
	@Test
	void testCalcularProductos() {
		tienda.agregarProducto(p1);
		tienda.agregarProducto(p2);
		double resultadoesperado = 1100;
		
		assertEquals(resultadoesperado, tienda.calcularPrecioTotal());
			
	}
		

}
