import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        // === Ejemplo de Listas ===

        //Usar la interfaz List y no la implementacion concreta
        List<String>nombres = new ArrayList<>();

        //agregar elementos
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Lucia");

        System.out.println("Lista original"+nombres);
        //Acceder a un elemento
        String primero = nombres.get(0);
        System.out.println("primero"+primero);

        //Iteral con un for tradicional
        System.out.println("Iterar con un FOR tradicional: ");
        for(int i=0; i<nombres.size();i++){
            System.out.println("indice " +i+ " : "+nombres.get(i));
        }
        //Iterar con WHILE

        System.out.println("Iterar con WHILE: ");
        int index =0;
        while(index<nombres.size()){
            System.out.println("indice " +index+ " : "+nombres.get(index));
            index++;
        }

        //Iterar con forEach y lambda
        System.out.println("\nIterar con forEach (lambda)");
        nombres.forEach(nombre -> System.out.println(" - "+nombre));

        //Buscar elementos (contain)

        System.out.println("\n¿La lista contiene Ana" + nombres.contains("Ana"));

        //Ordenar con Comparador
        Collections.sort(nombres);//Orden alfabetico natural

        System.out.println("\nLista ordenada alfabeticamente"+nombres);
        //Orden inverso con comparador
        nombres.sort(Collections.reverseOrder());
        System.out.println("\nLista ordenada inversamente"+nombres);

        //Eliminar un elemento
        nombres.remove("Pedro");
        System.out.println("\nLista despues de eliminar a Pedro"+nombres);

        //Filtrar con Stream
        System.out.println("\nNombresque empiecen con 'C':");
        nombres.stream().filter(nombre -> nombre.startsWith("C")).forEach(System.out::println);

        //Convertir a inmutable (buena practica si n debe modificarse)
        List<String>nombresInmutables =  List.copyOf(nombres);
        System.out.println("\nLista inmutable"+nombresInmutables);
    }
}
