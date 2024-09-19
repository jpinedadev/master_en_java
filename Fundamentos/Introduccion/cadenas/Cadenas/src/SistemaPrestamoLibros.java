import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        /*Se pide crear un sistema para una biblioteca,
         la cual desea prestar libros, si cumple con CUALQUIERA
         de las siguientes condiciones.
        1. El usuario tiene credencial de estudiante
        2. El usuario vive a no mas de 3 km*/

        System.out.println("**Sistema prestamo libros**");
        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Tienes credencial de estudiante?true/false : ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuantos km vives de la biblioteca?: ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var elegiblePrestamo =
                tieneCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;

        System.out.println("¿Elegible para prestamos? "+elegiblePrestamo);
    }
}
