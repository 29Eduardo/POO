import  java.util.Scanner;
public class Jugador {
    // Atributos para la clase
    public String nombre ;
    public String posicion;
    public int edad;
    public int numero_camisa;
    public int salario;

    // Constructor

    public Jugador(String nombre, String posicion , int edad, int numero_camisa, int salario) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numero_camisa = numero_camisa;
        this.salario = salario;
    }

    // Método estatico
    public void presentar (){
        System.out.println("\nInformación del Jugador:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de camiseta: " + numero_camisa);
        System.out.println("Salario: " + salario);
    }
    public static Jugador presentar1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nRegistro de nuevo jugador:");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la posición: ");
        String posicion = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el número de camiseta: ");
        int numero_camisa = scanner.nextInt();

        System.out.print("Ingrese la salario: ");
        int salario = scanner.nextInt();

        return new Jugador(nombre, posicion, edad, numero_camisa, salario);
    }

}
