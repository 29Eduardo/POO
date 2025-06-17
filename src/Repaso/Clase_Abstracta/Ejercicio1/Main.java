package Repaso.Clase_Abstracta.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(5, 3);

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
