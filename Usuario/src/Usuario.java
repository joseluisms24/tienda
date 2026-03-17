public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad inválida: " + edad);
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad inválida: " + edad);
        }
        this.edad = edad;
    }
}
