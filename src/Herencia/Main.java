package Herencia;

public class Main {
    public static void main(String[] args) {

       Estudiante estudiante = new Estudiante("1726401126","Eduardo","Quitumbe","09879364021","edu@gamil.com","Desarrollo de Software", "Tercero",2004);
       estudiante.MostrarInformacionPersonal();
       estudiante.CalcularEdad(2004);


        Docente docente = new Docente("17402684","Juan","Chillogallo","26358778","juan@gmail.com","Medicina",9);
        //docente.MostrarInformacionPersonal();

        //Estudiante_presencial e1 = new Estudiante_presencial("172512264","Pedro","La Floresta","0364412654","pedr@gmail.com","Medicina","Segundo",7,"7-13");
        //e1.MostrarInformacionPersonal();

        Docente_virtual docente1 = new Docente_virtual("1726401126","Pedro","La Carolina","pedr@gmail.com","Desarrollo de Software",3,"POO","ZOOM");
        docente1.MostrarInformacionPersonal();



    }

}