package Herencia;
public class Estudiante extends Persona {
    public String carrera;
    public String nivel;
    public int anio_nacimiento;

    public Estudiante(String cedula, String nombre, String direccion, String telefono, String correo, String carrera, String nivel, int anio) {

        super(cedula, nombre, direccion, telefono, correo);
        this.carrera = carrera;
        this.nivel = nivel;
        this.anio_nacimiento = 2004;
    }

    public int CalcularEdad(int anio_nacimiento) {
        int anio = 2025;
        int edad = anio - anio_nacimiento;
        System.out.println("Edad: " + edad);
        return edad;
    }

    @Override
    public void MostrarInformacionPersonal() {
        System.out.println("------Informacion Personal Estudiante------");
        super.MostrarInformacionPersonal();
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);
    }
}
