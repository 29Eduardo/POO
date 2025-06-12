package Sistema_Compra_Bus;

public class Normal extends ServicioBase {
    private String ubicacionAsiento; // ventana, pasillo, al final, adelante
    private boolean maletaAdicional;

    public Normal(String ubicacionAsiento, boolean maletaAdicional) {
        super("Normal", 1); // Siempre incluye 1 maleta
        this.ubicacionAsiento = ubicacionAsiento;
        this.maletaAdicional = maletaAdicional;
    }

    @Override
    public double calcularCosto(double precioBase) {
        double costo = precioBase;
        if (maletaAdicional) {
            costo += 5; // $5 por maleta adicional
        }
        return costo;
    }

    // Getters y Setters
    public String getUbicacionAsiento() { return ubicacionAsiento; }
    public boolean isMaletaAdicional() { return maletaAdicional; }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Ubicación asiento: " + ubicacionAsiento);
        System.out.println("Maleta adicional: " + (maletaAdicional ? "Sí (+$5)" : "No"));
    }
}