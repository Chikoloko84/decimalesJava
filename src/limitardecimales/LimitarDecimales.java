package limitardecimales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LimitarDecimales {

    // Creamos un objeto Scanner
    private static Scanner lectura = new Scanner(System.in);

    // Almacenamos un número pedido por teclado para sacar la raiz cuadrada
    private static String numero = "";

    // Guardamos el número en una variable decimal
    private static double num = 0;

    //Guardamos el resultado de la raiz cuadrada
    private static double resultado = 0;

    public static void main(String[] args) {

        do {
           
            try {
                // Pedimos el número por teclado.
                System.out.println("Introduce un número");
                numero = lectura.nextLine();
                // Convertimos a double lo que el usuario introduce por teclado
                num = Double.parseDouble(numero);
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir "
                        + "un número mayor que cero.");
            }
        
        } while (numero.isEmpty() || num == 0);

        // Calculamos la raiz cuadrada del número introducido por teclado
        resultado = Math.sqrt(num);

        // Mostramos el resultado por pantalla
        System.out.println("El resultado de la raiz cuadrada de " + num + 
                " es " + resultado);

        // Reducimos el número de decimales a 2 con la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        
        // Mostramos el resultado con dos decimales
        System.out.println("El resultado de la raiz cuadrada de " + num +
                " es " + df.format(resultado));

        // Ahora hacemos lo mismo con el método format
        // de la clase envolvente String
        System.out.println("El resultado de la raiz cuadrada de " + num + 
                " es " + String.format("%.2f", resultado));
        
        // Otra forma de mostrar decimales es a través del método round de la
        // clase Math, de la siguiente manera

        System.out.println("El resultado de la raiz cuadrada de " + num + 
                " es " + (double) Math.round( resultado*100 ) / 100);
        
        // Cerramos el objeto lectura
        lectura.close();
    }
}
