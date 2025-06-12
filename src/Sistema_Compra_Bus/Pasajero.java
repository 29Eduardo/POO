package Sistema_Compra_Bus;
public class Pasajero {
    private String nombre;
    private String cedula;
    private String telefono;

    // Constructores
    public Pasajero() {}

    public Pasajero(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    // Método personalizado para imprimir datos
    public void imprimirDatos() {
        System.out.println("Pasajero: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Teléfono: " + telefono);
    }
}