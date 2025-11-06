public class Condicionales {

    public static void main(String[] args) {
        //== Ejemplos de condicionales==

        //if
        int edad = 20;
        if (edad >=18){
            System.out.println("Eres mayor de edad");
        }

        //if - else

        if (edad>=20){
            System.out.println("Eres mayor  de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }

        //Operador Ternario
        String mensaje = (edad >= 18) ? "Eres mayor de edad ": "Eres menor de edad";
        System.out.println(mensaje);
        int numero = 5;
        String tipo = (numero >= 0)?"Positivo" :"Negativo";
        System.out.println(tipo);

        //if - else if - else
        int nota = 75;

        if (nota >= 90){
            System.out.println("Exelente");
        } else if (nota >=70) {
            System.out.println("Aprovado");
        }
        else  {
            System.out.println("Reprovado");
        }

        //switch
        //Desde Java 14 se pueden usar switch con flechas (->), que son mas limpios
        int dia = 3;
        //Mala implementacion
        if(dia == 1){
            System.out.println("Lunes");
        }
        if (dia == 2){
            System.out.println("Martes");
        }
        if (dia == 3){
            System.out.println("Miercoles");
        }
        if (dia == 4){
            System.out.println("Jueves");
        }
        if (dia == 5){
            System.out.println("Viernes");
        }
        if (dia == 6){
            System.out.println("Es fin de semana");
        }
        //Optimizacion
        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            default-> System.out.println("Es fin de semana");
        }
        //Buenas practicas

        //Condicionales claras y expresivas
        int x = 1;
        int y = 2;
        int w = 3;
        int z = 4;

        //Malo
        if (x == 1 && y != 2 || z ==3 && w <5){
            //codigo
        }

        //Mejor
        boolean cumpleCondicion = (x == 1 && y != 2)||(z==3 && w < 5);
            if (cumpleCondicion) {
                System.out.println("La condicion es valida");
            }


        //Evitar anidaciones profundas
        //Dificil de leer
        boolean tieneIdentificacion = false;
        if (edad >= 18){
            if(tieneIdentificacion) {
                System.out.println("Puede entrar");
            }
        }

        //Mejor
        if (edad >= 18 && tieneIdentificacion){
            System.out.println("Puede entrar");
        }

        //Condicionales
        //Usar swicht en lugar de muchos else if
        //El operador ternario solo en casos simples
        //Si la logica es mas compleja, es mejor usar if-else para legibilidad
    }
}
