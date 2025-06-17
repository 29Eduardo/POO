package Repaso.Clase_Abstracta.Ejercicio4;

public class Persona {
    private int edad;

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
            System.out.println("Edad aceptada: " + edad);
        } else {
            System.out.println("Error: Edad inválida, no actualizada");
        }
    }
}

