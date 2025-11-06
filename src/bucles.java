import java.util.List;

public class bucles {

    public static void main(String[] args) {

        // == Ejemplos de bucles==

        //while
        int contador = 1 ;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;//importante incrementar para evitar bucles infinitos
        }

        //Do while

        int numero = 1;
        do {
            System.out.println("Numero: " + numero);
            numero++;
        }while (numero <= 5);

        //For clasico

        for (int i = 1; i <= 5; i++){
            System.out.println("Iteracion "+i);
        }

        //for - eacht (enhanced for)

        String[]frutas = {"Manzana","Banana","Naranja","Cereza"};
        for (String fruta : frutas) {
            System.out.println("Fruta "+fruta);
        }

        List<String> nombres = List.of("Ana","Pedro","Luis","Maria");

        //for eacht para Listas
        nombres.forEach(System.out::println);

        //for each para Listas

        nombres.forEach(n -> System.out.println(n.toLowerCase()));

        //Stream (desde java 8)
        //Stream forEach con lambda

        nombres.stream().forEach(nombre -> System.out.println("Nombre "+nombre));

        //Stream Filtrar y recorrer

        System.out.println("\nNombres con mas de 3 letras:");
        nombres.stream().filter(n -> n.length() == 3).forEach(System.out::println);

        //Usa for-each cuando solo nececites recorrer la coleccion, sin indices
        //Usa While o do While si no sabes cuantas iteraciones habra (ejemplo: leer hasta que el suario escriba "salir")
        //Evita bucles infinitos asegurandote de actualizar la condicion dentro del ciclo
        //Prefiere Streams cuando nececites operaciones de filtrado, mapeo o transfomaciones en colecciones.
        //No mezcles demaciadas logica dentro del bucle -> extrae a metodos si es necesario
    }
}
