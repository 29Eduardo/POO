package Repaso.Sistema_becas;

public class EstudianteBecado extends Estudiante {
    private String tipoBeca;

    public EstudianteBecado(String nombre, int edad, String carrera, double promedio, String tipoBeca) {
        super(nombre, edad, carrera, promedio);
        this.tipoBeca = tipoBeca;
    }

    public void aplicarDescuento() {
        double descuento = 0;
        if (tipoBeca.equals("Académica")){
            descuento = (promedio >= 9) ? 50 : 30;
        }else if (tipoBeca.equals("Económica")) {
            descuento = 40;
        } else {
            descuento = 30;
        }
        System.out.println("Descuento del " + descuento + "%");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de beca: " + tipoBeca);
    }
}


