package Correccion;

public class Main {
    public static void main(String[] args) {
        // Crear objetos usando los diferentes constructores

        // Objeto 1: Constructor con todos los datos (cumple requisitos)
        Postulante postulante1 = new Postulante(
                "Eduardo", "Ganchala", 21, "0991234567",
                "eduardo@gmail.com", "ecuatoriana", "baja",
                "Ingeniería en Sistemas", 90.0
        );
        postulante1.mostrarDatos();

        // Objeto 2: Constructor con nombre, apellido y carrera (no cumple inicialmente)
        Postulante postulante2 = new Postulante("Jorge", "Pérez", "Medicina");
        postulante2.mostrarDatos(); // No cumple (promedio 78 y edad 18)

        // Actualizar datos del postulante2
        postulante2.setEdad(19);
        postulante2.setPromedio(87.5);
        postulante2.setNacionalidad("ecuatoriana");
        postulante2.setCondicionSocioeconomica("alta");

        // Mostrar datos actualizados
        System.out.println("----- Postulante Actualizado -----");
        System.out.println("Nombre: " + postulante2.getNombre() + " " + postulante2.getApellido());
        System.out.println("Edad: " + postulante2.getEdad());
        System.out.println("Carrera: " + postulante2.getCarrera());
        System.out.println("Promedio: " + postulante2.getPromedio());
        System.out.println("Nacionalidad: " + postulante2.getNacionalidad());
        System.out.println("Condición socioeconómica: " + postulante2.getCondicionSocioeconomica());
        System.out.println();

        // Verificar si cumple requisitos después de actualizar
        postulante2.mostrarDatos();

        // Objeto 3: Constructor solo con nombre y apellido
        Postulante postulante3 = new Postulante("Ana", "García");
        postulante3.setEdad(20);
        postulante3.setPromedio(89.0);
        postulante3.setCondicionSocioeconomica("baja");
        postulante3.setCarrera("Derecho");
        postulante3.setNacionalidad("colombiana");

        postulante3.mostrarDatos();
    }
}