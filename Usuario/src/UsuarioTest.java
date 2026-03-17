


import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	Usuario usuario;
	@BeforeEach
	void setUp() throws Exception {
		usuario = new Usuario("Pepe", 20);
	}


	@Test
	void testGetNombre() {
		String resultadoEsperado = "Pepe";
		String resultadoActual = usuario.getNombre();
		assertEquals(resultadoEsperado, resultadoActual);
	}

	@Test
	void testGetEdad() {
		int resultadoEsperado = 20;
		int resultado = usuario.getEdad();
		assertEquals(resultadoEsperado, resultado);
		
	}

	@Test
	void testSetEdadValido() {
		usuario.setEdad(20);
		int resultado = usuario.getEdad();
		assertEquals(20, resultado);
	}
	
	@Test
	void testSetEdadNoValido() {
		IllegalArgumentException excepcion = assertThrows(IllegalArgumentException.class,()-> usuario.setEdad(-20));
		assertTrue(excepcion.getMessage().contains("Edad inválida:"));
	}
	
	

}
