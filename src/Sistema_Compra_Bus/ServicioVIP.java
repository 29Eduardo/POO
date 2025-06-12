package Sistema_Compra_Bus;

public class ServicioVIP extends ServicioBase {
    private ServicioAd serviciosAdicionales;
    private boolean maletaAdicional;

    public ServicioVIP(ServicioAd serviciosAdicionales, boolean maletaAdicional) {
        super("VIP", 2); // Siempre incluye 2 maletas
        this.serviciosAdicionales = serviciosAdicionales;
        this.maletaAdicional = maletaAdicional;
    }

    @Override
    public double calcularCosto(double precioBase) {
        double costo = precioBase * 1.30; // 30% de recargo
        if (maletaAdicional) {
            costo += 5; // $5 por maleta adicional
        }
        return costo;
    }

    // Getters y Setters
    public ServicioAd getServiciosAdicionales() { return serviciosAdicionales; }
    public boolean isMaletaAdicional() { return maletaAdicional; }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Maleta adicional: " + (maletaAdicional ? "Sí (+$5)" : "No"));
        serviciosAdicionales.imprimirDatos();
    }
}