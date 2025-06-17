package Repaso.Sistema_becas;

public class Main {
    public static void main(String[] args) {
        try {
            EstudianteBecado est1 = new EstudianteBecado("Luis", 20, "Sistemas", 9.2, "Académica");
            EstudianteBecado est2 = new EstudianteBecado("Ana", 19, "Derecho", 8.0, "Económica");

            est1.mostrarDatos();
            est1.aplicarDescuento();

            est2.mostrarDatos();
            est2.aplicarDescuento();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
