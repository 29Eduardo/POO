package Sistema_Compra_Bus;

public class Main {
    public static void main(String[] args) {
        // Crear 5 objetos con valores nulos y luego setear valores
        Pasajero pasajero1 = new Pasajero();
        pasajero1.setNombre("Juan Pérez");
        pasajero1.setCedula("1723456789");
        pasajero1.setTelefono("0991234567");

        Ruta ruta1 = new Ruta();
        ruta1.setOrigen("Quito");
        ruta1.setDestino("Guayaquil");
        ruta1.setPrecioBase(20.00);

        // Crear 5 objetos con valores iniciales
        Pasajero pasajero2 = new Pasajero("María Gómez", "1709876543", "0987654321");
        Ruta ruta2 = new Ruta("Quito", "Tulcán", 17.50);
        Ruta ruta3 = new Ruta("Quito", "Puyo", 15.00);
        Ruta ruta4 = new Ruta("Quito", "Riobamba", 17.50);

        // Servicios adicionales para VIP
        ServicioAd serviciosVIP = new ServicioAd(true, true, "Snacks y bebidas ilimitadas");

        // Crear servicios
        Normal servicioNormal1 = new Normal("ventana", true);
        ServicioVIP servicioVIP1 = new ServicioVIP(serviciosVIP, false);

        // Crear tickets
        Ticket ticket1 = new Ticket(pasajero1, ruta1, servicioNormal1, "A12", "2023-05-20");
        Ticket ticket2 = new Ticket(pasajero2, ruta2, servicioVIP1, "V05", "2023-05-21");

        // Imprimir información de los objetos
        System.out.println("=== Objetos creados con valores nulos y luego seteados ===");
        pasajero1.imprimirDatos();
        ruta1.imprimirDatos();
        System.out.println("\n");

        System.out.println("=== Objetos creados con valores iniciales ===");
        pasajero2.imprimirDatos();
        ruta2.imprimirDatos();
        ruta3.imprimirDatos();
        ruta4.imprimirDatos();
        System.out.println("\n");

        System.out.println("=== Tickets generados ===");
        ticket1.imprimirTicket();
        ticket2.imprimirTicket();
    }
}