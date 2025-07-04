package modelo;

public abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected int edad;

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public abstract void mostrarDatos();

    public int getEdad() {return edad;}
}

