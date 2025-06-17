package Repaso.Sistema_becas;

public class Estudiante extends Persona {
    protected String carrera;
    protected double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        super(nombre, edad);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public boolean esAptoBeca() {
        return promedio >= 8.5;
    }

    public void inscribir(String semestre) {
        System.out.println(nombre + " inscrito en " + semestre);
    }

    public void inscribir(String semestre, String modalidad) {
        System.out.println(nombre + " inscrito en " + semestre + " modalidad " + modalidad);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
}

