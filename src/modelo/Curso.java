package modelo;
import java.util.*;

public class Curso {
    private String nombre;
    private String disciplina;
    private int edad_min;
    private int edad_max;
    private String horario;
    private Entrenador entrenador;
    private List<Participante> inscritos;

    public Curso(String nombre, String disciplina, int edad_min, int edad_max, String horario, Entrenador entrenador) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.edad_min = edad_min;
        this.edad_max = edad_max;
        this.horario = horario;
        this.entrenador = entrenador;
        this.inscritos = new ArrayList<>();

    }

    public boolean inscrito(Participante p) {
        if (inscritos.size() < 30 && p.getEdad() >= edad_min && p.getEdad() <= edad_max) {
            inscritos.add(p);
            {
                return true;
            }
        }
        return false;
    }

    public void mostrarDatos() {
        System.out.println("------CURSO------");
        System.out.println("Curso: " + nombre + "("+ disciplina + ")");
        for (Participante p : inscritos) {
            p.mostrarDatos();
        }

    }
}