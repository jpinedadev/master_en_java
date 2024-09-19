import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        /* Calcular area y perimetro de un rectangulo
            area = base * altura
            perimetro = 2*(base+altura)
        */
        System.out.println("**Calculo del area**");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        //Calculo del area
        var areaRectangulo = base * altura;
        System.out.println("Area del rectangulo: "+areaRectangulo);

        //Calculo perimetro
        var perimetroRectangulo = (base+altura)*2;
        System.out.println("Perimetro del rectangulo: "+perimetroRectangulo);
    }
}
