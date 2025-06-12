package Sistema_Compra_Bus;

public class ServicioAd {
    private boolean wifi;
    private boolean tv;
    private String otrosServicios;

    public ServicioAd(boolean wifi, boolean tv, String otrosServicios) {
        this.wifi = wifi;
        this.tv = tv;
        this.otrosServicios = otrosServicios;
    }

    // Getters y Setters
    public boolean isWifi() { return wifi; }
    public boolean isTv() { return tv; }
    public String getOtrosServicios() { return otrosServicios; }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Servicios adicionales VIP:");
        System.out.println(" - WiFi: " + (wifi ? "Sí" : "No"));
        System.out.println(" - TV: " + (tv ? "Sí" : "No"));
        System.out.println(" - Otros: " + otrosServicios);
    }
}