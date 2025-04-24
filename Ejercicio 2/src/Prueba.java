import java.util.Scanner;

public class Prueba {
    public static Empleado crearEmpleado(Scanner scanner, int numeroEmpleado) {
        System.out.println("\nRegistro del Empleado #" + numeroEmpleado);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese la fecha de ingreso (DD/MM/AAAA): ");
        String fechaIngreso = scanner.nextLine();

        return new Empleado(nombre, cargo, salario, fechaIngreso);
    }
}