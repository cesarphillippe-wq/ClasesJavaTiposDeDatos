import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> carros = new ArrayList<>();
        carros.add(new Carro("Mercedez",2025,"negro","Deportivo","Uso Gasolina"));
        carros.add(new Carro("Ford",1994,"Rojo","carga","Uso Gasolina"));
        carros.add(new Carro("Fiat",2002,"Negro","cedan","Uso Gasolina"));
        carros.add(new Carro("Urvan",2023,"Gris","carga","Uso Gasolina"));
        carros.add(new Carro("Fiat",2007,"Negro","cedan","Uso Gasolina"));

        System.out.println("\nLista de carros:");
        carros.forEach(System.out::println);

        System.out.println("\nCarros de carga: ");
        carros.stream().filter(c->c.getTipo().equals("carga")).forEach(System.out::println);


    };
}
