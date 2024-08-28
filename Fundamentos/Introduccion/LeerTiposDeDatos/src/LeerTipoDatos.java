import java.util.Scanner;

public class LeerTipoDatos {
    public static void main(String[] args) {
        //Leer tipos de datos por consola
        var consola = new Scanner(System.in);
        //leer tipo int edad
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();

        //leer tipo dobule altura
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();

        //leer tipo string nombre
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.next();

    }
}
