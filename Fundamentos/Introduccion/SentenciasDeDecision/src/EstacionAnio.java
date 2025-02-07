import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Estacion del anio***");

        var consola = new Scanner(System.in);

        System.out.println("Proporciona el valor del mes (1-12)");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "";

        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8 ) {
            estacion = "verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otonio";
        }else {
            estacion = "desconocida";
        }

        //imprimiendo
        System.out.printf("La estacion para el mes %d es %s",mes,estacion);
    }
}
