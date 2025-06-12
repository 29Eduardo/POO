package Sistema_Compra_Bus;

public class Ruta {
    private String origen;
    private String destino;
    private double precioBase;

    // Constructores
    public Ruta() {}

    public Ruta(String origen, String destino, double precioBase) {
        this.origen = origen;
        this.destino = destino;
        this.precioBase = precioBase;
    }

    // Getters y Setters
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    // Método personalizado para imprimir datos
    public void imprimirDatos() {
        System.out.println("Ruta: " + origen + " - " + destino);
        System.out.println("Precio base: $" + precioBase);
    }
}