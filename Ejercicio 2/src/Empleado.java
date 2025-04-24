import java.util.Scanner;
public class Empleado {
    // Atributos del empleado
    public String nombre;
    public String cargo;
    public double salario;
    public String fechaIngreso;

    // Constructor
    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    // Metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println("\nInformación del Empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    // Metodo para crear empleado por teclado
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
