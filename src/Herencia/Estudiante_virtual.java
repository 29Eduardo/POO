package Herencia;

public class Estudiante_virtual extends Estudiante {
    public String plataforma ;
    public String tutor_virtual;


    public Estudiante_virtual(String cedula, String nombre, String direccion, String telefono, String correo, String carrera, String nivel,int anio,String plataforma,String tutor_virtual) {

        super(cedula,nombre,direccion,telefono,correo,carrera,nivel,anio);
        this.plataforma = plataforma;
        this.tutor_virtual = tutor_virtual;
    }

    @Override
    public void MostrarInformacionPersonal() {
        System.out.println("------ Modalidad Virtual ------");
        super.MostrarInformacionPersonal();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Tutor virtual: " + tutor_virtual);
    }
}
