import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTest {
		Sistema sistema;
		Usuario u1, u2;
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Sistema();
		u1 = new Usuario("Pepe", 90);
		u2 = new Usuario("Jose", 80);
		
	}
	
	@Test
	void testAgregarUsuario() {
		sistema.agregarUsuario(u1);
		sistema.agregarUsuario(u2);

		assertEquals(2, sistema.obtenerUsuarios().size());
		
	}

	@Test
	void testObtenerUsuarios() {
		sistema.agregarUsuario(u1);
		sistema.agregarUsuario(u2);
		
		assertEquals(2, sistema.obtenerUsuarios().size());
		assertTrue(sistema.obtenerUsuarios().contains(u1));
		assertTrue(sistema.obtenerUsuarios().contains(u2));

		
	}

	@Test
	void testTotalEdad() {
		sistema.agregarUsuario(u1);
		sistema.agregarUsuario(u2);
		double resultadoesperado = 170;
		
		assertEquals(resultadoesperado, sistema.totalEdad());
	}

}
