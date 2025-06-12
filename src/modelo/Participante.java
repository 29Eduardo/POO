package modelo;

public class Participante  extends Persona{
    public Participante(String nombre, String cedula, int edad) {
        super(nombre, cedula, edad);
    }

    @Override
    public void mostrarDatos() {
        System.out.print("----------Participantes-------");
        System.out.print("Nombres: "+nombre);
        System.out.print("Edad: "+ edad);
    }
}
