import java.util.Scanner;

public class SistemasDescuentosVip {
    public static void main(String[] args) {
        System.out.println("** Sistemas Descuentos Vip **");
        final var NO_PRODUCTOS_DESCUENTOS = 10;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuantos productos comprastes?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("¿Eres miembro? True/False: ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && tienesMembresia;
        System.out.println("Tienes descuento VIP?: "+esElegibleDescuento);

    }
}
