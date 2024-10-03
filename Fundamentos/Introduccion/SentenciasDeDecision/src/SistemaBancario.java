import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("**Bienvenido al sistema Bancario**");
        var consola = new Scanner(System.in);

        System.out.println("Deseas salir del sistema (true/false)? ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        //verificando el sistema
        if (!salirSistema){
            System.out.println("Continuamos dentro del sistema...");
        }
        else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
