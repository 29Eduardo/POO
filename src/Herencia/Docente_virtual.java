package Herencia;

public class Docente_virtual {
    // Atributo docente (acceso directo a sus atributos públicos)
    public Docente docente;
    public String materia;
    public String plataforma_clases;

    public Docente_virtual(String cedula, String nombre, String direccion, String correo,
                           String Facultad_pertenece, int HorasAsignadasClases,
                           String materia, String plataforma_clases) {
        // Crear instancia de Docente con teléfono vacío
        this.docente = new Docente();
        this.docente.cedula = cedula;
        this.docente.nombre = nombre;
        this.docente.direccion = direccion;
        this.docente.correo = correo;
        this.docente.Facultad_pertenece = Facultad_pertenece;
        this.docente.HorasAsignadasClases = HorasAsignadasClases;

        this.materia = materia;
        this.plataforma_clases = plataforma_clases;
    }

    // Método para mostrar información (acceso directo a atributos)
    public void MostrarInformacionPersonal() {
        System.out.println("Información del Docente Virtual:");
        System.out.println("Cédula: " + docente.cedula);
        System.out.println("Nombre: " + docente.nombre);
        System.out.println("Dirección: " + docente.direccion);
        System.out.println("Correo: " + docente.correo);
        System.out.println("Facultad: " + docente.Facultad_pertenece);
        System.out.println("Horas asignadas: " + docente.HorasAsignadasClases);
        System.out.println("Materia: " + materia);
        System.out.println("Plataforma: " + plataforma_clases);
    }
}