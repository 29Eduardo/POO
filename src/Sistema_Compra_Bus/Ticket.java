package Sistema_Compra_Bus;

public class Ticket {
    private Pasajero pasajero;
    private Ruta ruta;
    private ServicioBase servicio;
    private String asiento;
    private String fecha;

    public Ticket(Pasajero pasajero, Ruta ruta, ServicioBase servicio, String asiento, String fecha) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.servicio = servicio;
        this.asiento = asiento;
        this.fecha = fecha;
    }

    // Método para calcular el costo total
    public double calcularCostoTotal() {
        return servicio.calcularCosto(ruta.getPrecioBase());
    }

    // Método para imprimir el ticket
    public void imprimirTicket() {
        System.out.println("======== TICKET DE VIAJE ========");
        System.out.println("Fecha: " + fecha);
        pasajero.imprimirDatos();
        ruta.imprimirDatos();
        servicio.imprimirDatos();
        System.out.println("Asiento: " + asiento);
        System.out.println("TOTAL A PAGAR: $" + calcularCostoTotal());
        System.out.println("=================================");
    }

    // Getters y Setters
    public Pasajero getPasajero() { return pasajero; }
    public Ruta getRuta() { return ruta; }
    public ServicioBase getServicio() { return servicio; }
    public String getAsiento() { return asiento; }
    public String getFecha() { return fecha; }
}