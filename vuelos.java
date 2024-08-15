import java.util.Scanner;

public class vuelos{
    public static void main(String[] args) {
        
        //Declaro variables y pido nombre y edad por consola

        final int precioNormal = 1000000;
        int precioTiquete;
        int edad;

        String nombre;
        System.out.println("Ingrese su Nombre");
        Scanner teclado = new Scanner (System.in);
        nombre = teclado.nextLine();

        System.out.println(nombre +" Por favor Ingrese su edad");
        Scanner teclado1 = new Scanner (System.in);
        edad = teclado1.nextInt();

        //Utilizo un if else anidados
        if (edad < 2) {
            System.out.println("Prohibido viajar.");
        } else if (edad >= 2 && edad < 5) {
            precioTiquete = 0; // Tiquete gratuito
            System.out.println("El precio de su tiquete es : $" + precioTiquete +" su tiquete es gratuito");
        } else if (edad >= 5 && edad < 11) {
            precioTiquete = precioNormal / 2; // 50% del precio normal
            System.out.println("El precio de su tiquete es : $" + precioTiquete);
        } else if (edad >= 11 && edad < 15) {
            precioTiquete = (precioNormal * 3) / 4; // 75% del precio normal
            System.out.println("El precio de su tiquete es : $" + precioTiquete);
        } else {
            precioTiquete = precioNormal; // Precio normal
            System.out.println("El precio de su tiquete es : $" + precioTiquete);
        } 
    }
}