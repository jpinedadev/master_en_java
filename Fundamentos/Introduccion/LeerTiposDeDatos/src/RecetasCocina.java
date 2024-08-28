import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("*** Recetas de cocina ***");
        System.out.print("Ingresa el nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Ingresa el tiempo de preparacion: ");
        var tiempo = Integer.parseInt(consola.nextLine());

        System.out.print("Nivel de dificultad: ");
        var nivel = consola.nextLine();

        //presentar datos
        System.out.println("\n--- Datos de la receta ---");
        System.out.println("\tNombre: "+nombre);
        System.out.println("\tIngredientes: "+ingredientes);
        System.out.println("\tTiempo: "+tiempo);
        System.out.println("\tDificultad: "+nivel);
    }
}
