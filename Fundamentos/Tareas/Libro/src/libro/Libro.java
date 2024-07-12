
package libro;

import java.util.Scanner;

public class Libro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporciona el titulo: ");
        String titulo = teclado.nextLine();
        System.out.println("Proporciona el autor: ");
        String autor = teclado.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
        
    }
    
}
