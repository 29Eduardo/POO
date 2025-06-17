package Repaso.Sobrecarga.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(5, 3));
        System.out.println(calc.sumar(2.5, 3.1));
        System.out.println(calc.sumar(1, 2, 3));
    }
}