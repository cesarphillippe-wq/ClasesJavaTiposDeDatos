import javax.swing.*;
import java.util.HashMap;

public class EjemplosHashMap {
    public static void main(String[] args) {
        //Crear un HashMap donde la clave es String y el valor es Integer

        HashMap<String,Integer> edades = new HashMap<>();

        //Agregar elementos
        edades.put("Oscar",25);
        edades.put("Maria",30);
        edades.put("Carlos",28);

        //Obtener un valor por su clave
        int edadOscar = edades.get("Oscar");
        System.out.println("Edad de Osacar es: "+edadOscar);

        //Verificar si una clave existe
        if(edades.containsKey("Maria")){
            System.out.println("maria esta en el mapa");

        }
        //Eliminar una clave
        edades.remove("Carlos");

        //Recorrer un mapa
        for(String nombre : edades.keySet()){
            System.out.println(nombre + "tiene "+edades.get(nombre)+"años");
        }

        //Tamaño del HashMap
        System.out.println("Tamaño del HashMap: " +edades.size());

        /*
        |Metodo                     | Descripcion                           |
        |-------------------------- |---------------------------------------|
        | ´put(K clave, V valor)    |Inserta o reemplaza un valor           |
        | ´get(Object clave)        | Obtiene el valor asociado             |
        | ´remove(Object clave)     |Elimina una entrada                    |
        |containsKey(Object clave)  |Verifica si existe una clave           |
        |containsValue(Object valor)|Verifica si existe unvalor             |
        |size()                     |Devuelve cuantos pares hay             |
        |clear()                    |Elimina todos los elementos            |
        |keyset()                    |Devuelve un set con la claves          |
        |values                     |Devuelve una coleccin con los valores  |
        |entrySet()                 |Devuelve un Set de pares Map.Entry<K,V>|
         */
    }
}
