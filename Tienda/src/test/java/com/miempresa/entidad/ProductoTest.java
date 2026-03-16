package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("Pizza", 100);
		
	}

	@Test
	void testGetPrecio() {
		double resultadoEsperado = 100;
		double resultado = producto.getPrecio();
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	void testGetNombre() {
		String resultadoesperado = "Pizza";
		String resultadoActual = producto.getNombre();
		assertEquals(resultadoesperado, resultadoActual);
	}

	@Test
	void testSetNombre() {
		String resultadoesperado = "Platano";
		producto.setNombre("Platano");
		String resultadoActual = producto.getNombre();
		assertEquals(resultadoesperado, resultadoActual);
	}

	@Test
	void testSetPrecioValido() {
		producto.setPrecio(200);
		assertEquals(200, producto.getPrecio());
		
	}
	
	@Test
	void testSetPrecioNeg() {
	IllegalArgumentException excepcion = assertThrows( IllegalArgumentException.class, () -> producto.setPrecio(-50) ); 
	// Solo verificamos que contenga la frase principal 
		assertTrue(excepcion.getMessage().contains("El precio no puede ser negativo"));
		}

}
