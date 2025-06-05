package main;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar Participante");
            System.out.println("2. Ver Cursos Disponibles por Edad");
            System.out.println("3. Inscribir en Curso");
            System.out.println("4. Ver Inscritos por Curso");
            System.out.println("5. Ver Horarios de Canchas");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Registrando Participante");
                    break;
                case 2:
                    System.out.println("Cursos disponibles por Edad");
                    break;
                case 3:
                    System.out.println("Inscribir en curso");
                    break;
                case 4:
                    System.out.println("Inscritos por curso");
                    break;
                case 5:
                    System.out.println("Mostrando horarios por Canchas");
                    break;
                case 6:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 6);
        scanner.close();
    }
}

