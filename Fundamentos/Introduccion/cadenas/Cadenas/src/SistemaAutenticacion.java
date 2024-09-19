import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        /* Crea un programa para validad el USUARIO y el PASSWORD
           proporcionados por el usuario.
            - Crea 2 CONSTANTES con los valores correctos y posteriormente
              compara que el USUARIO y el PASSWORD proporcionados por el usuario
              sean validos.
            - Debe solicitar el USUARIO y el PASSWORD al usuario y si son iguales
              que los valores almacenados en las constantes, debe imprimir TRUE
              de lo contrario FALSE.
        */
        System.out.println("**Sistema autenticacion**");

        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.print("¿Cual es tu usuario?: ");
        var usuarioIngresado = consola.nextLine();

        System.out.print("¿Cual es tu password?: ");
        var passwordIngresado = consola.nextLine();

        var sonDatosCorrectos = usuarioIngresado.equals(USUARIO_VALIDO)
                && passwordIngresado.equals(PASSWORD_VALIDO);

        System.out.println("Datos correctos?: "+sonDatosCorrectos);
    }
}
