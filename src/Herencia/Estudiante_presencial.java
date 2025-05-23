package Herencia;
public class Estudiante_presencial extends Estudiante {
    public int horas_presencial;
    public String horario ;

    public Estudiante_presencial(String cedula, String nombre, String direccion, String telefono, String correo, String carrera, String nivel, int anio,int horas_presencial, String horario) {

        super(cedula,nombre,direccion,telefono,correo,carrera,nivel,anio);
        this.horas_presencial = horas_presencial;
        this.horario = horario;
    }

    @Override
    public void MostrarInformacionPersonal() {
        System.out.println("------ Modalidad Presencial------");
        super.MostrarInformacionPersonal();
        System.out.println("Horas presencial: " + horas_presencial);
        System.out.println("Horario: " + horario);
    }
}
