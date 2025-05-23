package Herencia;
public class Docente extends Persona {
    public String Facultad_pertenece;
    public int HorasAsignadasClases;

    public Docente(){}
    public Docente(String cedula, String nombre, String direccion, String telefono, String correo,String Facultad_pertenece, int HorasAsignadasClases) {

        super(cedula, nombre, direccion, telefono, correo);
        this.Facultad_pertenece = Facultad_pertenece;
        this.HorasAsignadasClases = HorasAsignadasClases;
    }

    @Override
    public void MostrarInformacionPersonal() {
        System.out.println("------Informacion Personal Docente------");
        super.MostrarInformacionPersonal();
        System.out.println("Facultad_pertenece: " + Facultad_pertenece);
        System.out.println("Horas_Asignadas: " + HorasAsignadasClases);
    }
}
