package Herencia;

public class Persona {
    public String cedula;
    public String nombre;
    public String direccion;
    public String telefono;
    public String correo;

    public  Persona (){

    }
    public Persona(String cedula, String nombre, String direccion, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void MostrarInformacionPersonal (){

        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);

    }
}
