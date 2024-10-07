import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("**Salud y Fitness**");

        //constantes
        final var META_PASOS_DIARIOS= 10000;
        final var CALORIAS_POR_PASO= 0.04;

        //pedir valores al usuario
        var consola = new Scanner(System.in);

        System.out.println("cual es tu nombre?");
        var nombreUsuario = consola.nextLine();

        System.out.println("Cuantos pasos has caminado hoy?");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        //verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios>= META_PASOS_DIARIOS) ? "si" : "no";

        //calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        //mostramos la informacion
        System.out.printf("""
                %nUSUARIO: %s
                Pasos hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzadas: %s
                -------------------------------------
                La meta de pasos diarios es de: %d pasos
                """,nombreUsuario,pasosDiarios,caloriasQuemadas,metaAlcanzada,META_PASOS_DIARIOS);


    }
}
