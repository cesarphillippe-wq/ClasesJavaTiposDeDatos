import java.time.LocalDate;
import java.util.Scanner;

public class LeerDatos {

    public static void main(String[] args) {
        /*Crea un programa que pida tu nombre y edad por consola, y luego imprima un mensaje como
        "Hola, Carlos. Tienes 25 años. ¡Bienvenido a Java!*/

        String nombre;
        int edad, fechaNac;
        int anio = LocalDate.now().getYear();

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre? ");
        nombre = sc.nextLine();
        System.out.println("Que edad tienes edad? ");
        edad = sc.nextInt();

        fechaNac = anio - edad;

        System.out.println("Hola "+nombre+" tienes "+edad+" años. Bienvenido a Java y naciste en  "+fechaNac);
    }
}
