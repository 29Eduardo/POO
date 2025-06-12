package Sistema_Compra_Bus;

public abstract class ServicioBase {
    protected String tipo;
    protected int maletas;

    public ServicioBase(String tipo, int maletas) {
        this.tipo = tipo;
        this.maletas = maletas;
    }

    // Método abstracto para calcular costo
    public abstract double calcularCosto(double precioBase);

    // Getters y Setters
    public String getTipo() { return tipo; }
    public int getMaletas() { return maletas; }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Tipo de servicio: " + tipo);
        System.out.println("Maletas incluidas: " + maletas);
    }
}