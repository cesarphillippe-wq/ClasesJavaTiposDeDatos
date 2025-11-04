/**
 * Clase principal del proyecto
 * @autor cesarphillippe
 * version 1.0
 */

public class Main {
    public static void main(String[] args) {
/**
 * Metodo principal de aplicacion
 * @param args argumentos de linea de comandos (no se usan en esta aplicacion)
 */
    byte edad = 25;
    //el byte es un entero pequeño que va del -128 al 127, ocupa un byte "8 bits"
        System.out.println("byte edad=" + edad);
        short anio = 1900;
        System.out.println("short anio=" + anio);
        //es un tipo de entero mediano que va del -32768 al 32767, ocupa 2 bytes
        int dia = 2020;
        System.out.println("int dia=" + dia);
        //int: Entero estandar (-2,147,483,648 a 2,147,483,647), ocupa 4 bytes

    }
}