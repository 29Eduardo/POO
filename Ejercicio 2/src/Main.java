import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE GESTIÓN DE EMPLEADOS");
        System.out.println("-------------------------------");

        // Crear 3 empleados solicitando datos al usuario
        Empleado empleado1 = Empleado.crearEmpleado(scanner, 1);
        Empleado empleado2 = Empleado.crearEmpleado(scanner, 2);
        Empleado empleado3 = Empleado.crearEmpleado(scanner, 3);

        // Mostrar información de todos los empleados
        System.out.println("\n--- RESUMEN DE EMPLEADOS ---");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();

        scanner.close();
    }
}
