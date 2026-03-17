import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	    private List<Usuario> usuarios = new ArrayList<>();

	    public void agregarUsuario(Usuario u) {
	        usuarios.add(u);
	    }

	    public List<Usuario> obtenerUsuarios() {
	        return new ArrayList<>(usuarios);
	    }

	    public int totalEdad() {
	        return usuarios.stream().mapToInt(Usuario::getEdad).sum();
	    }
	}
