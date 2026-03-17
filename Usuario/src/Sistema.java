import java.util.ArrayList;
import java.util.List;
/**
 *
 Esto es una clase llamada sistema que teien consigo una lista de usuarios con array.
 
 */
public class Sistema {
	/**
	 *
	 Crea un atributo dentro de la clase para los usuarios
	 */
	    private List<Usuario> usuarios = new ArrayList<>();
	    /**
	    *Agrega un usuario a la clase sistema
 *
 * @param agregarUsuario el cual añade un usuario.
 * 
	    */
	    public void agregarUsuario(Usuario u) {
	        usuarios.add(u);
	    }
	    /**
	    * Obtener usuarios es para obtener los usuarios en la lista.
	    *
	    * @param obtenerUsuarios Obtiene los usuarios
	    * @return devuelve una nueva lista con los usuarios.
	   
	    */		
	    public List<Usuario> obtenerUsuarios() {
	        return new ArrayList<>(usuarios);
	    }
	    /**
		    *Calculo de las edades de los usuarios
		    *
		    * @param CalculoEdadtotal Calcular la edad total
		    * @return devuelve la suma de los usuarios obtenidos por edad..
		   */
	    public int totalEdad() {
	        return usuarios.stream().mapToInt(Usuario::getEdad).sum();
	    }
	}
