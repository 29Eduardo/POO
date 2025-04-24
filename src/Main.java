
public class Main {
    public static void main(String[] args) {
        // Crear instancia de los jugadores
        Jugador jugador1 = new Jugador("Cristiano Ronaldo", "DC",40,7,400);
        Jugador jugador2 = new Jugador("Sergio Ramos", "DFC",41,8,800);
        Jugador jugador3 = new Jugador("Lionel Messi", "DC",37,10,200);
        // Mostrar informacion de los jugadores quemados
        jugador1.presentar();
        jugador2.presentar();
        jugador3.presentar();
        // Jugador de Scanner
        Jugador jugador4 = Jugador.presentar1();
    }
}